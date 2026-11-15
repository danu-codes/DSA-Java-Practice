package stackusingarray;

/** Fixed-size stack of Strings backed by an array. */
public class ArrayStack {

    private final String[] stackArray;
    private int top;
    private final int maxSize;

    public ArrayStack(int size) {
        stackArray = new String[size];
        top = -1;
        maxSize = size;
    }

    public void push(String value) {
        if (isFull()) {
            System.out.println("Array is full!");
        } else {
            stackArray[++top] = value;
        }
    }

    /** Removes and returns the top element, or null if the stack is empty. */
    public String pop() {
        if (isEmpty()) {
            System.out.println("Array is Empty!");
            return null;
        }
        return stackArray[top--];
    }

    /** Returns the top element without removing it, or null if the stack is empty. */
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void displayArray() {
        System.out.println();
        for (int i = 0; i <= top; i++) {
            System.out.println("Element indexNo " + i + " : " + stackArray[i]);
        }
        System.out.println();
    }
}
