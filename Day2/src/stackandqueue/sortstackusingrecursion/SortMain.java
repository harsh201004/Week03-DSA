package stackandqueue.sortstackusingrecursion;
import java.util.Stack;

public class SortMain  {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements into the stack
        stack.push(8);
        stack.push(0);
        stack.push(1);
        stack.push(5);
        stack.push(4);

        System.out.println("Stack before sorting: " + stack);

        SortStack.sort(stack);
        // Display the sorted stack
        System.out.println("Stack after sorting: " + stack);
    }
}