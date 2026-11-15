package heapsort;

import java.util.Scanner;

/**
 * Heap Sort (max-heap, ascending order).
 * Time: O(n log n)  |  Space: O(1)
 */
public class HeapSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int elements = input.nextInt();
        int[] numArray = new int[elements];

        for (int index = 0; index < elements; index++) {
            System.out.print("Enter the element " + (index + 1) + " : ");
            numArray[index] = input.nextInt();
        }

        printArray(numArray, elements);
        heapSort(numArray, numArray.length);
        printArray(numArray, elements);
    }

    public static void printArray(int[] numArray, int elements) {
        System.out.println();
        System.out.print("numArray : [ ");
        for (int index = 0; index < elements; index++) {
            System.out.print(numArray[index] + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void heapSort(int[] array, int arrayLength) {
        // Build max heap
        for (int indexOfNode = arrayLength / 2 - 1; indexOfNode >= 0; indexOfNode--) {
            heapify(array, arrayLength, indexOfNode);
        }

        // Move the current root (largest) to the end, then restore the heap
        for (int index = arrayLength - 1; index > 0; index--) {
            int temp = array[index];
            array[index] = array[0];
            array[0] = temp;

            heapify(array, index, 0);
        }
    }

    public static void heapify(int[] array, int arrayLength, int indexOfNode) {
        int large = indexOfNode;
        int left = 2 * indexOfNode + 1;
        int right = 2 * indexOfNode + 2;

        if (left < arrayLength && array[left] > array[large]) {
            large = left;
        }
        if (right < arrayLength && array[right] > array[large]) {
            large = right;
        }

        if (large != indexOfNode) {
            int temp = array[indexOfNode];
            array[indexOfNode] = array[large];
            array[large] = temp;

            heapify(array, arrayLength, large);
        }
    }
}
