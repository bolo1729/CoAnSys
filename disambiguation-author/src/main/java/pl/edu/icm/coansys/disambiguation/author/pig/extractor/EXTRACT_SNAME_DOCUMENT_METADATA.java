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

package pl.edu.icm.coansys.disambiguation.author.pig.extractor;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.pig.EvalFunc;
import org.apache.pig.backend.executionengine.ExecException;
import org.apache.pig.data.DataBag;
import org.apache.pig.data.DataByteArray;
import org.apache.pig.data.DataType;
import org.apache.pig.data.DefaultDataBag;
import org.apache.pig.data.Tuple;
import org.apache.pig.data.TupleFactory;
import org.apache.pig.impl.logicalLayer.FrontendException;
import org.apache.pig.impl.logicalLayer.schema.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.edu.icm.coansys.commons.java.StackTraceExtractor;
import pl.edu.icm.coansys.models.DocumentProtos.Author;
import pl.edu.icm.coansys.models.DocumentProtos.DocumentWrapper;

/**
 *
 * @author pdendek
 */
public class EXTRACT_SNAME_DOCUMENT_METADATA extends EvalFunc<DataBag> {

    private static final Logger logger = LoggerFactory.getLogger(EXTRACT_SNAME_DOCUMENT_METADATA.class);

    @Override
    public Schema outputSchema(Schema p_input) {
        try {
            return Schema.generateNestedSchema(DataType.BAG);
        } catch (FrontendException e) {
            logger.error("Error in creating output schema:", e);
            throw new IllegalStateException(e);
        }
    }

    @Override
    public DataBag exec(Tuple input) throws IOException {

        if (input == null || input.size() == 0) {
            return null;
        }

        try {
            DataByteArray dba = null;
            try {
                dba = (DataByteArray) input.get(0);
            } catch (ExecException e) {
                logger.error("Error in reading field:", e);
                throw e;
            }

            DocumentWrapper dm = null;
            try {
                dm = DocumentWrapper.parseFrom(dba.get());
            } catch (Exception e) {
                logger.error("Error in reading ByteArray to DocumentMetadata:", e);
                throw e;
            }

            DataBag ret = new DefaultDataBag();
            DataByteArray metadata =
                    new DataByteArray(dm.getDocumentMetadata().toByteArray());

            List<Author> authors =
                    dm.getDocumentMetadata().getBasicMetadata().getAuthorList();

            for (int i = 0; i < authors.size(); i++) {
                String sname = authors.get(i).getSurname();
                Object[] to = new Object[]{sname, metadata, i};
                Tuple t = TupleFactory.getInstance().newTuple(Arrays.asList(to));
                ret.add(t);
            }

            return ret;

        } catch (Exception e) {
            logger.error("Error in processing input row:", e);
            throw new IOException("Caught exception processing input row:\n"
                    + StackTraceExtractor.getStackTrace(e));
        }
    }
}
