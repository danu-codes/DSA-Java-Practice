package genericstack;

public class GenericStackDemo {

    public static void main(String[] args) {
        GenericStack<String> stringStack = new GenericStack<>(5);
        stringStack.push("Apple");
        stringStack.push("Banana");
        stringStack.push("Orange");
        stringStack.push("Jack");
        stringStack.push("Lemon");
        stringStack.push("dump");          // stack is full
        stringStack.displayStackArray();

        System.out.println("Pop : " + stringStack.pop());
        System.out.println("Pop : " + stringStack.pop());
        System.out.println("Peek : " + stringStack.peek());
        stringStack.displayStackArray();

        GenericStack<Integer> intStack = new GenericStack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.push(40);
        intStack.push(50);
        intStack.push(60);                 // stack is full
        intStack.displayStackArray();

        System.out.println("Pop : " + intStack.pop());
        System.out.println("Pop : " + intStack.pop());
        System.out.println("Peek : " + intStack.peek());
        intStack.displayStackArray();
    }
}
