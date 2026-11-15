package stackusingarray;

public class StackUsingArray {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push("laptop");
        stack.push("smart phone");
        stack.push("watch");
        stack.push("pen");
        stack.push("tablet");
        stack.displayArray();

        System.out.println("Peek : " + stack.peek());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());
        stack.displayArray();
    }
}
