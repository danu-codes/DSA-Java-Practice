package reversearrayusingstack;

/** Fixed-size stack of ints backed by an array. */
public class Stack {

    private final int[] intArray;
    private int top;

    public Stack(int size) {
        intArray = new int[size];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Array is Full!");
        } else {
            intArray[++top] = value;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return intArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return intArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == intArray.length - 1;
    }

    public void displayArray() {
        System.out.print("intArray = [");
        for (int index = 0; index <= top; index++) {
            System.out.print(" " + intArray[index]);
        }
        System.out.print(" ]");
    }
}
