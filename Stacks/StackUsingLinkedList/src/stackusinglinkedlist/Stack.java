package stackusinglinkedlist;

/** Stack of ints implemented on top of the linked list (push/pop at the front). */
public class Stack {

    private final LinkedList list = new LinkedList();

    public void push(int value) {
        list.insertAtFront(value);
    }

    public int pop() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        int value = list.getTop().getValue();
        list.deleteFirstElement();
        return value;
    }

    public int peek() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return list.getTop().getValue();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.printValues();
    }
}
