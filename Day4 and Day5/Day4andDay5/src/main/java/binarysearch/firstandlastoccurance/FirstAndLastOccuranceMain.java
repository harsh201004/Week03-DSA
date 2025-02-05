package binarysearch.firstandlastoccurance;

import java.util.*;
public class FirstAndLastOccuranceMain {
    // Method to find first and last occurrence
    public static int[] findFirstAndLast(int[] arr, int target) {
        int first = FirstAndLastOccurance.findFirst(arr, target);
        int last = FirstAndLastOccurance.findLast(arr, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size and array elements
        System.out.println("Enter the size of the sorted array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the sorted array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target value
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        // Find first and last occurrence
        int[] result = findFirstAndLast(arr, target);


        if (result[0] == -1) {
            System.out.println("Target value not found in the array.");
        } else {
            System.out.println("First occurrence: " + result[0]);
            System.out.println("Last occurrence: " + result[1]);
        }
        sc.close();
    }
}
