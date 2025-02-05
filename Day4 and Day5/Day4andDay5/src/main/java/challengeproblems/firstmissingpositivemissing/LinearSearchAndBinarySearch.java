package challengeproblems.firstmissingpositivemissing;

import java.util.*;
public class LinearSearchAndBinarySearch {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Replace negative numbers and numbers greater than n with (n + 1)
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n) {
                nums[i] = n + 1;
            }
        }

        // Step 2: Mark presence of numbers
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (val >= 1 && val <= n) {
                nums[val - 1] = -Math.abs(nums[val - 1]);
            }
        }

        // Step 3: Find first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return n+1;
}

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        Arrays.sort(arr);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
