package circularqueueusingarray;

public class CircularQueueUsingArray {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.printQueue();

        System.out.println("Dequeue : " + queue.dequeue());
        System.out.println("Dequeue : " + queue.dequeue());
        System.out.println("Dequeue : " + queue.dequeue());
        System.out.println();
        queue.printQueue();

        queue.enqueue(78);      // wraps around the end of the array
        queue.enqueue(100);
        queue.enqueue(101);     // queue is full again
        queue.printQueue();
    }
}
