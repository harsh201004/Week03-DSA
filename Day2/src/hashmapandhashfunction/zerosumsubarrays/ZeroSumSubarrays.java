package hashmapandhashfunction.zerosumsubarrays;
import java.util.*;
public class ZeroSumSubarrays {
    public static void findZeroSumSubarrays(int[] arr) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;

        // Initialize with sum 0 at index -1 for cases where sum becomes 0 at any index
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If the sum has been seen before, subarrays exist
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            // Store the current index for this sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        // Print subarrays
        if (result.isEmpty()) {
            System.out.println("No zero-sum subarrays found.");
        } else {
            System.out.println("Zero-sum subarrays:");
            for (int[] subarray : result) {
                System.out.println("From index " + subarray[0] + " to " + subarray[1]);
            }
        }
    }
}
