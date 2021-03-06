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

package pl.edu.icm.coansys.logsanalysis;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.SequenceFile.Reader;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import pl.edu.icm.coansys.models.MostPopularProtos;
import pl.edu.icm.coansys.models.MostPopularProtos.MostPopularStats;
import pl.edu.icm.coansys.models.MostPopularProtos.ResourceStat;
import pl.edu.icm.oozierunner.OozieRunner;

public class TestIT {

    @Test
    public void testTest1() throws Exception {
        System.out.println("Test1");
        OozieRunner or = new OozieRunner();
        File workflowOutputData = or.run();

        assertTrue(workflowOutputData.exists());
        assertTrue(workflowOutputData.isDirectory());
        assertTrue(workflowOutputData.listFiles().length > 0);

        int foundRecords = 0;
        long counter = 0;

        for (File f : FileUtils.listFiles(workflowOutputData, null, true)) {
            if (f.isFile() && f.getName().startsWith("part-")) {
                Configuration conf = new Configuration();
                Path path = new Path("file://" + f.getAbsolutePath());
                Reader reader = new Reader(conf, Reader.file(path));
                NullWritable key  = NullWritable.get();
                BytesWritable value = new BytesWritable();
                while (reader.next(key, value)) {
                    MostPopularStats protoValue = MostPopularProtos.MostPopularStats.parseFrom(value.copyBytes());
                    for (ResourceStat stat : protoValue.getStatList()) {
                        foundRecords++;
                        counter += stat.getCounter();
                    }
                }
            }
        }

        assertEquals(5, foundRecords);
        assertEquals(44, counter);
    }
}