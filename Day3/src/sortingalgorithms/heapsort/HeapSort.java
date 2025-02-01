package sortingalgorithms.heapsort;

public class HeapSort {

    public static void buildMaxHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Function to maintain Max Heap property
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    // Heap Sort function
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Max Heap
        buildMaxHeap(arr, n);

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to end
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    // Utility function to swap elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
