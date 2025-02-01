package sortingalgorithms.mergesort;

import java.util.*;

public class BookPriceSort {

    public static void mergeSort(double[] prices) {
        if (prices.length <= 1) {
            return;
        }

        int mid = prices.length / 2;

        // Divide the array into two halves
        double[] left = Arrays.copyOfRange(prices, 0, mid);
        double[] right = Arrays.copyOfRange(prices, mid, prices.length);

        mergeSort(left);
        mergeSort(right);

        // Merge the sorted halves
        merge(prices, left, right);
    }

    private static void merge(double[] prices, double[] left, double[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the two arrays while there are elements in both
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                prices[k++] = left[i++];
            } else {
                prices[k++] = right[j++];
            }
        }

        // Copy remaining elements from left, if any
        while (i < left.length) {
            prices[k++] = left[i++];
        }

        // Copy remaining elements from right, if any
        while (j < right.length) {
            prices[k++] = right[j++];
        }
    }
}