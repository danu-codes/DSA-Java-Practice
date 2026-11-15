package genericstack;

/** Fixed-size generic stack backed by an array. */
public class GenericStack<T> {

    private int top;
    private final int maxSize;
    private final T[] stackArray;

    @SuppressWarnings("unchecked")
    public GenericStack(int size) {
        this.maxSize = size;
        this.stackArray = (T[]) new Object[size];
        this.top = -1;
    }

    public void push(T value) {
        if (isFull()) {
            System.out.println("Stack Array is full!");
        } else {
            stackArray[++top] = value;
        }
    }

    /** Removes and returns the top element, or null if the stack is empty. */
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Array is Empty!");
            return null;
        }
        T value = stackArray[top];
        stackArray[top--] = null;
        return value;
    }

    /** Returns the top element without removing it, or null if the stack is empty. */
    public T peek() {
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

    public void displayStackArray() {
        System.out.println();
        for (int index = 0; index <= top; index++) {
            System.out.println("Element[" + index + "] : " + stackArray[index]);
        }
        System.out.println();
    }
}
