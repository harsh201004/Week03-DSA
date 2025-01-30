package stackandqueue.queueusingstack;

public class QueueUsingStackMain {
    public static void main(String[] args) {
        // Create Queue object using two stacks
        QueueUsingStack queue = new QueueUsingStack();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue elements
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        // Peek the front element
        System.out.println(queue.peek());

        // Dequeue the last element
        System.out.println(queue.dequeue());

        // Check if the queue is empty
        System.out.println(queue.isEmpty());
    }
}
