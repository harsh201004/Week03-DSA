package sortingalgorithms.quicksort;
import java.util.*;
public class QuickSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        System.out.println("Enter the product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        // Sorting product prices using Quick Sort
        QuickSort.quickSort(prices, 0, n - 1);

        // Displaying the sorted product prices
        System.out.println("Sorted Product Prices: " + Arrays.toString(prices));

    }
}
