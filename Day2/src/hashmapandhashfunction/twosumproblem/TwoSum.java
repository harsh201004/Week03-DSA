package hashmapandhashfunction.twosumproblem;
import java.util.*;
public class TwoSum {
    public static int[] findTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Return indices
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
