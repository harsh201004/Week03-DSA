package recursiveanditerativefibonaccitest;

import org.junit.Assert;
import org.junit.Test;
import recursiveanditerativefibonacci.RecursiveVsIterativeFibonacci;

public class RecursiveVsiteartiveFibonacciTest {
    @Test
    public void test() {
        int[] sizes = {10, 30};
        for (int n : sizes) {
            double[] result = RecursiveVsIterativeFibonacci.compare(n);
            Assert.assertEquals(result[0] > result[1], true);
        }
    }
}
