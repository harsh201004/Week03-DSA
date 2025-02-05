package binarysearch.searchtargetedvalue;

import java.util.Scanner;

public class TargetValueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Target Value");
        int targetValue = sc.nextInt();

        TargetValue targetSearch = new TargetValue();
        boolean found = targetSearch.searchElement(matrix, targetValue);
        if (found) {
            System.out.println("Target value found in the matrix.");
        } else {
            System.out.println("Target value not found in the matrix.");
        }
        sc.close();
    }
}
