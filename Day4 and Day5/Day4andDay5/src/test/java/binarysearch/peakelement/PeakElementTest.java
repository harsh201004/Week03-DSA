package binarysearch.peakelement;

import binarysearch.peekelementinarray.PeakElement;
import org.junit.Test;
import static org.junit.Assert.*;
public class PeakElementTest {
    @Test
    public void testPeakElement() {
        int[]arr = {1,2,4,3,2};
        assertEquals(2, PeakElement.peakElement(arr));
    }
}
