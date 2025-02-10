package sortinglargedataefficiently;

import java.util.Arrays;

public class SortingComparison {
    //Bubble Sort
    public static void bubbleSort(int[] marks) {
        int n = marks.length;


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                }
            }

        }
    }

    //Merge Sort
    public static void mergeSort(int arr[], int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //for(leftover elements of 2nd sorted part)
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy elements from temp arr to original array
        for( k=0, i = si;k < temp.length;k++,i++){
            arr[i] = temp[k];

        }

    }

    //Quick Sort
    public static void quickSort(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }

        int pIdx = partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);

    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si;j < ei;j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }

    //method to compare
    public static double[] comparePerformance(int size) {
        int[] dataSet = new int[size];
        double[] output = new double[3];

        for (int i = 0; i < size; i++) {
            dataSet[i] = i;
        }

        //Bubble Sort Performance
        long start = System.nanoTime();
        bubbleSort(dataSet);
        long bubbleSortTime = System.nanoTime() - start;

        //Merge Sort Performance
        start = System.nanoTime();
        mergeSort(dataSet, 0, dataSet.length - 1);
        long mergeSortTime = System.nanoTime() - start;

        //Quick Sort Performance
        start = System.nanoTime();
        quickSort(dataSet, 0, dataSet.length - 1);
        long quickSortTime = System.nanoTime() - start;

        output[0] = bubbleSortTime/1000000.0;
        output[1] = mergeSortTime/1000000.0;
        output[2] = quickSortTime/1000000.0;

        System.out.println("Dataset Size: " + size);
        System.out.println("Bubble Sort Time: " + output[0] + " ms");
        System.out.println("Merge Sort Time: " + output[1] + " ms");
        System.out.println("Quick Sort Time: " + output[2] + " ms");
        System.out.println("---------------------------------");
        return output;

    }


}
