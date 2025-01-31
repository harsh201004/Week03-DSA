package hashmapandhashfunction.pairwithgivensum;
import java.util.*;

public class PairWithGivenSunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        PairWithGivenSum.hasPairWithSum(arr, target);

        sc.close();
    }
}
