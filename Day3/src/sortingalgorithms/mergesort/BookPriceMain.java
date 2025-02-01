package sortingalgorithms.mergesort;
import java.util.*;

public class BookPriceMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        System.out.println("Enter the prices of the books:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextDouble();
        }

        BookPriceSort.mergeSort(prices);

        // Displaying the sorted book prices
        System.out.println("Sorted Book Prices: " + Arrays.toString(prices));

        sc.close();
    }
}
