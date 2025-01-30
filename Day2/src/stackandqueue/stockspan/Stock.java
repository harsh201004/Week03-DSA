package stackandqueue.stockspan;
import java.util.Stack;
public class Stock {
    public static void calculateSpan(int[] prices, int n) {

        Stack<Integer> stack = new Stack<>();

        //store the span values
        int[] span = new int[n];

        // Traverse through all days
        for (int i = 0; i < n; i++) {
            // Calculate the span for the current day
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, the span is the current index + 1 (all previous days have lower price)
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Otherwise, the span is the difference between the current index and the index at the top of the stack
                span[i] = i - stack.peek();
            }

            // Push the current day's index onto the stack
            stack.push(i);
        }

        // Print the result (stock spans for each day)
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
