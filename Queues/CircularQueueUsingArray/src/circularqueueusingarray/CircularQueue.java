package circularqueueusingarray;

/** Fixed-size circular queue of ints backed by an array. */
public class CircularQueue {

    private final int[] queueArr;
    private final int size;
    private int front, rear, count;

    public CircularQueue(int size) {
        this.size = size;
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        queueArr = new int[size];
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        queueArr[rear] = value;
        rear = (rear + 1) % size;
        count++;
        System.out.println("rear : " + rear);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty!");
        }
        int value = queueArr[front];
        front = (front + 1) % size;
        count--;
        System.out.println("front : " + front);
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is Empty!");
        }
        return queueArr[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void printQueue() {
        System.out.println();
        System.out.print("Queue : ");
        for (int index = 0; index < count; index++) {
            System.out.print(queueArr[(front + index) % size] + " ");
        }
        System.out.println();
    }
}
