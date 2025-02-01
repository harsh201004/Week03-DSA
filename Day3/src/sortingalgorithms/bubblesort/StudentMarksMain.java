package sortingalgorithms.bubblesort;
import java.util.*;

public class StudentMarksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks of students:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        // Sorting the marks
        StudentMarksSort.bubbleSort(marks);

        // Displaying the sorted marks
        System.out.println("Sorted Marks: " + Arrays.toString(marks));

    }
}
