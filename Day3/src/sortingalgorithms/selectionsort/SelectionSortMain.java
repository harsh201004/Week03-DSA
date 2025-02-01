package sortingalgorithms.selectionsort;
import java.util.*;

public class SelectionSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter the exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        SelectionSort.selectionSort(scores);

        // Displaying the sorted exam scores
        System.out.println("Sorted Exam Scores: " + Arrays.toString(scores));

    }
}
