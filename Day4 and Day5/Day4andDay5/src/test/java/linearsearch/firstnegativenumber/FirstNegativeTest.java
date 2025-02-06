package linearsearch.firstnegativenumber;

import org.junit.Test;
import static org.junit.Assert.*;
public class FirstNegativeTest {
    @Test
    public void testFirstNegative() {
        int[] array = new int[] { 1, 5, 3, 4, -5, 6, 7 };
        assertEquals(4,FirstNegative.firstNegative(array));
    }
}
