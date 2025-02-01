package sortingalgorithms.insertionsort;
import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] ids = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        EmployeeIDSort.insertionSort(ids);

        // Displaying result
        System.out.println("Sorted Employee IDs: " + Arrays.toString(ids));

    }
}
