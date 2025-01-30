package stackandqueue.slidingwindow;
import java.util.*;
public class SlidingWindowMain {

    public static void main(String[] args) {
        int[] nums = {1, 4, 0, -2, 5, 3, 5, 7};
        int k = 3;
        int[] result = SlidingWindow.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(result));
    }
}
