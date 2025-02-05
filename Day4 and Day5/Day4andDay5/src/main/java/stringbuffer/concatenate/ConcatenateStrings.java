package stringbuffer.concatenate;

import java.util.Scanner;
public class ConcatenateStrings {
    public static String concatenateStrings(String[] strArray) {

        StringBuffer sb = new StringBuffer();

        for (String str : strArray) {
            sb.append(str);
        }
        // Return concatenated string
        return sb.toString();
    }
}
