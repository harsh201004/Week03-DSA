package hashmapandhashfunction.zerosumsubarrays;
import java.util.*;
public class ZeroSumSubarraysMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ZeroSumSubarrays subarrayOfZero = new ZeroSumSubarrays();

        ZeroSumSubarrays.findZeroSumSubarrays(arr);
    }

    private static void findZeroSumSubarrays(int[] arr) {
    }
}
