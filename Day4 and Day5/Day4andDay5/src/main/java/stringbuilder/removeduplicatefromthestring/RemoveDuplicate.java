package stringbuilder.removeduplicatefromthestring;

import java.util.*;
public class RemoveDuplicate {
    public static String removeDuplicates(String input) {

        StringBuilder result = new StringBuilder();

        HashSet<Character> seen = new HashSet<>();

        // Iterate each character
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If the character is not in the HashSet
            if (seen.add(currentChar)) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

}
