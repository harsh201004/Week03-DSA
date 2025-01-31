package hashmapandhashfunction.pairwithgivensum;
import java.util.*;
public class PairWithGivenSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        // HashMap to store encountered numbers
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            // Check if complement exists
            if (seen.contains(complement)) {
                System.out.println("Pair found: (" + complement + ", " + num + ")");
                return true;
            }

            // Store the number in HashSet
            seen.add(num);
        }

        System.out.println("No pair found.");
        return false;
    }
}
