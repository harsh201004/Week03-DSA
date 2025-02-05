package stringbuilder.reversethestring;

public class StringReverse {
    public static String reverseString(String input) {

        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
