package stringbuilder.reversethestring;

import org.junit.Test;
import static org.junit.Assert.*;
public class StringReverseTest {
    @Test
    public void reverseStringTest(){
        assertEquals("olleh",StringReverse.reverseString("hello") );
    }

}
