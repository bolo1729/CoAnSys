/*
 * This file is part of CoAnSys project.
 * Copyright (c) 2012-2013 ICM-UW
 * 
 * CoAnSys is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * CoAnSys is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with CoAnSys. If not, see <http://www.gnu.org/licenses/>.
 */

package pl.edu.icm.coansys.commons.scala

import java.io.File

/**
 * @author Mateusz Fedoryszak (m.fedoryszak@icm.edu.pl)
 */
object files {
  def retrieveFilesByExtension(dir: File, extension: String): Iterable[File] = {
    def toFiles(f: File): Iterable[File] = {
      if (f.isDirectory)
        retrieveFilesByExtension(f, extension)
      else if (f.getName.endsWith("." + extension))
        Some(f)
      else
        None
    }
    for {
      d <- dir.listFiles()
      f <- toFiles(d)
    } yield f
  }
}
