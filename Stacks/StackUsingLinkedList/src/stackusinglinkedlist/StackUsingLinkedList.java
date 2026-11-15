package stackusinglinkedlist;

public class StackUsingLinkedList {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();                       // 4->3->2->1->0->null

        System.out.println("Peek : " + stack.peek());
        System.out.println("Pop  : " + stack.pop());
        System.out.println("Pop  : " + stack.pop());
        stack.display();                       // 2->1->0->null
    }
}
