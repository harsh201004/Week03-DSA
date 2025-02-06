package binarysearch.rotationpoint;

import binarysearch.rotationpointofrotatedarray.RotationPoint;
import org.junit.Test;
import static org.junit.Assert.*;
public class SmallestInTheRotatedTeat {
    @Test
    public void testSmallestInTheRotated() {
        int[] arr ={3,4,5,1,2};
        assertEquals(3, RotationPoint.rotationPoint(arr));
    }
}
