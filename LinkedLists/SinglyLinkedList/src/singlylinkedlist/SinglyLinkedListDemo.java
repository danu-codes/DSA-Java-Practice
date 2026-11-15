package singlylinkedlist;

public class SinglyLinkedListDemo {

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtBeginning(8);
        list.insertAtBeginning(4);
        list.insertAtBeginning(7);
        list.display();                 // 7 4 8

        list.insertAtPosition(11, 0);
        list.display();                 // 11 7 4 8

        list.insertAtPosition(9, 2);
        list.display();                 // 11 7 9 4 8

        list.deleteAtPosition(0);
        list.display();                 // 7 9 4 8

        list.deleteAtPosition(10);      // invalid position
        list.display();
    }
}
