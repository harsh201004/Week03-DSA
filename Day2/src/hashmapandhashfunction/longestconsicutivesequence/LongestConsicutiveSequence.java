package hashmapandhashfunction.longestconsicutivesequence;
import java.util.*;
public class LongestConsicutiveSequence {
    public static int longestConsecutive(int[] arr) {
        if (arr.length == 0) {
            System.out.println("No elements in the array.");
            return 0;
        }

        // Store elements in a HashSet for quick lookup
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;
        int startNum = 0;

        for (int num : set) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count consecutive elements
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update max length and starting number
                if (currentStreak > maxLength) {
                    maxLength = currentStreak;
                    startNum = num;
                }
            }
        }

        System.out.println("Length of the longest consecutive sequence: "+ maxLength);

        // Print the longest consecutive sequence
        System.out.print("Longest consecutive sequence: ");
        for (int i = 0; i < maxLength; i++) {
            System.out.print((startNum + i) + " ");
        }
        System.out.println();
        return 0;
    }
}
