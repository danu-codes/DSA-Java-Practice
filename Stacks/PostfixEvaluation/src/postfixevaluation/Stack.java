package postfixevaluation;

/** Fixed-size stack of ints backed by an array. */
public class Stack {

    private final int[] data;
    private int top;

    public Stack(int size) {
        this.top = -1;
        data = new int[size];
    }

    public void push(int value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full!");
        }
        data[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return data[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return data[top];
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
