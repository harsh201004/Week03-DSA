package sortingalgorithms.insertionsort;

public class EmployeeIDSort {
    public static void insertionSort(int[] ids) {
        int n = ids.length;
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i;

            // Shift larger elements to the right
            while (j > 0 && ids[j-1] > key) {
                ids[j] = ids[j-1];
                j--;
            }

            // Insert key into its correct position
            ids[j] = key;
        }
    }
}
