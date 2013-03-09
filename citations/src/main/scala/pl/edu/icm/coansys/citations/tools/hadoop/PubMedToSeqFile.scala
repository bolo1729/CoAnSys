/*
 * (C) 2010-2012 ICM UW. All rights reserved.
 */

package pl.edu.icm.coansys.citations.tools.hadoop

import java.io.File
import org.apache.hadoop.io.{Text, SequenceFile}
import org.apache.hadoop.fs.Path
import org.apache.hadoop.conf.Configuration
import org.slf4j.LoggerFactory
import io.Source
import pl.edu.icm.coansys.commons.scala.files

/**
 * @author Mateusz Fedoryszak (m.fedoryszak@icm.edu.pl)
 */
object PubMedToSeqFile {

  val logger = LoggerFactory.getLogger(PubMedToSeqFile.getClass)

  class EncapsulatedSequenceFileWriter(val writer: SequenceFile.Writer) extends (((String, String)) => Unit) {
    private val keyWritable = new Text()
    private val valueWritable = new Text()

    def apply(arg: (String, String)) {
      val (key, value) = arg
      keyWritable.set(key)
      valueWritable.set(value)
      writer.append(keyWritable, valueWritable)
    }

    def close() {
      writer.close()
    }
  }

  object EncapsulatedSequenceFileWriter {
    def fromLocal(uri: String): EncapsulatedSequenceFileWriter = {
      val conf: Configuration = new Configuration
      val path: Path = new Path(uri)

      val writer = SequenceFile.createWriter(conf, SequenceFile.Writer.file(path),
        SequenceFile.Writer.keyClass(classOf[Text]), SequenceFile.Writer.valueClass(classOf[Text]))
      new EncapsulatedSequenceFileWriter(writer)
    }
  }

  def main(args: Array[String]) {
    val workDir = args(0)
    val outFile = args(1)
    val extension = "nxml"
    val nlms = files.retrieveFilesByExtension(new File(workDir), extension)
    val writeToSeqFile = EncapsulatedSequenceFileWriter.fromLocal(outFile)
    val prefixLength = new File(workDir).getAbsolutePath.length
    nlms.par.foreach {
      nlm => try {
        val key = nlm.getAbsolutePath.substring(prefixLength)
        val value = Source.fromFile(nlm).mkString
        writeToSeqFile.synchronized {
          writeToSeqFile((key, value))
        }
      } catch {
        case ex: Throwable =>
          logger.error("Error while processing " + nlm.getCanonicalPath, ex)
      }
    }
    writeToSeqFile.close()
  }
}
