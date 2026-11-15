package reversearrayusingstack;

/** Reverses an int array by pushing every element and popping them back. */
public class ReverseArrayUsingStack {

    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 2, 8};
        Stack stack = new Stack(arr.length);

        for (int index = 0; index < arr.length; index++) {
            stack.push(arr[index]);
        }
        stack.displayArray();
        System.out.println();

        for (int index = 0; index < arr.length; index++) {
            arr[index] = stack.pop();
        }

        System.out.print("intArray = [");
        for (int value : arr) {
            System.out.print(" " + value);
        }
        System.out.println(" ]");
    }
}
