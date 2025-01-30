package stackandqueue.queueusingstack;
import java.util.Stack;
public class QueueUsingStack {
        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public QueueUsingStack() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        // Enqueue: Push element to stack1
        public void enqueue(int x) {
            stack1.push(x);
        }

        // Dequeue: Pop element from stack2
        public int dequeue() {
            // If stack2 is empty, transfer elements from stack1 to stack2
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            // If stack2 is still empty, the queue is empty
            if (stack2.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }

            return stack2.pop();
        }

        // Peek: Get the front element of the queue
        public int peek() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            if (stack2.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }

            return stack2.peek();
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
}