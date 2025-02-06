package stringbuffer.concatenate;

import org.junit.Test;
import static org.junit.Assert.*;
public class ConcatenateTest {
    @Test
    public void testConcatenate() {
        String[] words = {"Hello", "Java"};
        assertEquals("HelloJava", ConcatenateStrings.concatenateStrings(words));
    }
}
