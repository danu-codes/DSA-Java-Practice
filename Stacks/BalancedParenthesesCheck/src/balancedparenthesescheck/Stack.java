package balancedparenthesescheck;

/** Fixed-size stack of chars backed by an array. */
public class Stack {

    private final char[] strArray;
    private int top;

    public Stack(int size) {
        strArray = new char[size];
        this.top = -1;
    }

    public void push(char value) {
        if (isFull()) {
            System.out.println("Array is Full!");
        } else {
            strArray[++top] = value;
        }
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return strArray[top--];
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return strArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == strArray.length - 1;
    }
}
