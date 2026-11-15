package recursion;

public class Recursion {

    public static void main(String[] args) {
        System.out.println("Fact : " + fact(3));

        int[] array = new int[5];
        fill(array, array.length - 1);
        printArray(array);
    }

    /** Fills arr[i] = i, starting from the last index and recursing downwards. */
    public static void fill(int[] arr, int num) {
        if (num < 0) {
            return;
        }
        arr[num] = num;
        fill(arr, num - 1);
    }

    public static void printArray(int[] arr) {
        System.out.print("Array : ");
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    public static int fact(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * fact(num - 1);
    }
}
