package sortinglargedataefficientlytest;

import org.junit.Assert;
import org.junit.Test;
import sortinglargedataefficiently.SortingComparison;

public class SortingComparisonTest {
    @Test
    public void test() {
        int[] sizes = {1000, 10000};
        for (int size : sizes) {
            double[] result = SortingComparison.comparePerformance(size);
            Assert.assertEquals(result[1] < result[0] && result[1] < result[2], true);
        }
    }
}
