package stringbuilder.removeduplicatefromthestring;

import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveDuplicateTester {
    @Test
    public void testRemoveDuplicate() {
        assertEquals("abcd",RemoveDuplicate.removeDuplicates("aaabbccdd"));
    }
}
