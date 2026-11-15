package singlylinkedlist;

/** Singly linked list of ints (positions are 0-based). */
public class SinglyLinkedList {

    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int val, int position) {
        if (position < 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 0) {
            insertAtBeginning(val);
            return;
        }

        // Walk to the node just before the target position
        Node temp = head;
        for (int pos = 1; pos < position && temp != null; pos++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }

        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (position < 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (position == 0) {
            head = head.next;
            return;
        }

        // Walk to the node just before the target position
        Node prev = head;
        for (int pos = 1; pos < position && prev != null; pos++) {
            prev = prev.next;
        }
        if (prev == null || prev.next == null) {
            System.out.println("Invalid position!");
            return;
        }
        prev.next = prev.next.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
