package binarysearch.rotationpointofrotatedarray;

import java.util.*;
public class RotationPointMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<size; i++){
        array[i] = sc.nextInt();
        }
        System.out.println("Index of the smallest element in the array is: " + RotationPoint.rotationPoint(array));
    }
}