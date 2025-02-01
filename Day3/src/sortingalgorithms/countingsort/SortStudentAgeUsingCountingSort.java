package sortingalgorithms.countingsort;
import java.util.*;

public class SortStudentAgeUsingCountingSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the ages of the students in the range of 10-18: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Create an instance of StudentAgeSorter
        SortStudentsAge sorter = new SortStudentsAge(arr);

        // Sort and display the sorted ages
        sorter.sortAges();
        sorter.displayAges();
    }
}
