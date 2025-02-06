package binarysearch.firstandlasstoccurance;

import binarysearch.firstandlastoccurance.FirstAndLastOccurance;
import org.junit.Test;
import static org.junit.Assert.*;
public class FirstAndLastOccuranceTest {
    @Test
    public void test() {
        int[] arr = {1,2,3,3,3,4,5,5};
        int target =3;
        assertEquals(2, FirstAndLastOccurance.findFirst(arr, target));
        assertEquals(4, FirstAndLastOccurance.findLast(arr, target));
    }
}
