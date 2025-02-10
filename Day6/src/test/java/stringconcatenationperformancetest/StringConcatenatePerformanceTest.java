package stringconcatenationperformancetest;

import org.junit.Assert;
import org.junit.Test;
import stringconcatenationperformance.StringConcatenatePerformance;

public class StringConcatenatePerformanceTest {
    @Test
    public void test() {
        int[] sizes = {1000, 10000};
        for (int size : sizes) {
            double[] result = StringConcatenatePerformance.compare(size);
            Assert.assertEquals(result[1] < result[0] && result[1] < result[2], true);
        }
    }
}
