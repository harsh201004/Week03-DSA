package binarysearch.peekelementinarray;

import java.util.*;
public class PeakElementMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("The peak element is on the index of : " + PeakElement.peakElement(array));
    }
}
