package largefilereadingtest;

import largefilereadingefficiency.LargeFileReading;
import org.junit.Assert;
import org.junit.Test;

public class LargeFilereadingTest {
    @Test
    public void test() {
        String[] files = {"largefile.pdf", "largefile2.pdf", "largefile3.pdf"};
        for (String file : files) {
            double[] result = LargeFileReading.compare(file);
            Assert.assertEquals(result[0] > result[1], true);
        }
    }
}
