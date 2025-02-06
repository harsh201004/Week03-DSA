package binarysearch.searchtargetedvalue;

import org.junit.*;
import static org.junit.Assert.*;
public class SearchTheTargetValue {
    @Test
    public void test() {
        int[][] matrix ={{1,2},{3,4}};
        int target = 3;
        assertEquals(true,TargetValue.searchElement(matrix,target));
    }
}
