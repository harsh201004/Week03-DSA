package searchtargetinlargedatasettest;

import java.util.Arrays;

public class SearchComparison {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left)/2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    //method to compare performance
    public static double[] comparePerformance(int size) {
        int[] dataSet = new int[size];
        double[] output = new double[2];

        for (int i = 0; i < size; i++) {
            dataSet[i] = i;
        }

        int target = size - 1;

        //Linear Search Performance
        long start = System.nanoTime();
        linearSearch(dataSet, target);
        long linearSearchTime = System.nanoTime() - start;

        //Binary Search Performance
        Arrays.sort(dataSet);

        start = System.nanoTime();
        binarySearch(dataSet, target);
        long binarySearchTime = System.nanoTime() - start;

        output[0] = linearSearchTime/1000000.0;
        output[1] = binarySearchTime/1000000.0;

        System.out.println("Dataset Size: " + size);
        System.out.println("Linear Search Time: " + output[0] + " ms");
        System.out.println("Binary Search Time: " + output[1] + " ms");
        System.out.println("---------------------------------");
        return output;

    }
}
