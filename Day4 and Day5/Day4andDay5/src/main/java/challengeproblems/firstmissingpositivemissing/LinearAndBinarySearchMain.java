package challengeproblems.firstmissingpositivemissing;

public class LinearAndBinarySearchMain {
    public static void main(String[] args) {
        int[] nums = {9, 2, -1, 1};
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 2;

        int missingPositive = LinearSearchAndBinarySearch.firstMissingPositive(nums);
        int index = LinearSearchAndBinarySearch.binarySearch(arr, target);

        System.out.println("First missing positive: " + missingPositive);
        System.out.println("Index of target: " +index);
    }
}
