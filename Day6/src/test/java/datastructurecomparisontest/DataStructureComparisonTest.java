package datastructurecomparisontest;

import comparingdatastructuresforsearching.DataStructuresComparison;
import org.junit.Assert;
import org.junit.Test;

public class DataStructureComparisonTest {
    @Test
    public void test() {
        int[] sizes = {1000, 10000, 1000000};
        for (int size : sizes) {
            double[] result = DataStructuresComparison.compare(size);
            Assert.assertEquals(result[1] < result[0] || result[1] < result[2], true);
        }
    }
}
