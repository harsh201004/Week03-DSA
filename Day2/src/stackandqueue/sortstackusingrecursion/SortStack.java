package stackandqueue.sortstackusingrecursion;
import java.util.Stack;
public class SortStack {

    // Main function to sort the stack using recursion
    public static void sort(Stack<Integer> stack) {
        // Base case: If stack is empty, return
        if (stack.isEmpty()) {
            return;
        }

        // Pop the top element
        int top = stack.pop();

        // Recursively sort
        sort(stack);

        // Insert the popped element
        insertSorted(stack, top);
    }

    // function to insert an element into a sorted stack
    public static void insertSorted(Stack<Integer> stack, int element) {

        if (stack.isEmpty() || element >= stack.peek()) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
    }
}
