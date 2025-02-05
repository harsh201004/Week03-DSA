package linearsearch.firstnegativenumber;

import java.util.*;
public class FirstNegativeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arrayOfElements = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arrayOfElements[i] = sc.nextInt();
        }
        System.out.println("The first negative number is on index: " + FirstNegative.firstNegative(arrayOfElements));
    }
}
