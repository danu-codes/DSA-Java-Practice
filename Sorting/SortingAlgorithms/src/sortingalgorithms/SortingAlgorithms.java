package sortingalgorithms;

import java.util.Arrays;

/**
 * Bubble Sort, Selection Sort and Insertion Sort.
 * Each algorithm sorts the array in place; main() runs them on separate copies.
 */
public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 2, 6, 2, 4};
        System.out.println("Array          : " + Arrays.toString(arr));

        int[] copy = arr.clone();
        bubbleSort(copy);
        System.out.println("Bubble sort    : " + Arrays.toString(copy));

        copy = arr.clone();
        selectionSort(copy);
        System.out.println("Selection sort : " + Arrays.toString(copy));

        copy = arr.clone();
        insertionSort(copy);
        System.out.println("Insertion sort : " + Arrays.toString(copy));
    }

    /** Time: O(n^2) worst, O(n) best (already sorted). */
    public static void bubbleSort(int[] arr) {
        for (int outer = arr.length - 1; outer > 0; outer--) {
            boolean swapped = false;
            for (int inner = 0; inner < outer; inner++) {
                if (arr[inner] > arr[inner + 1]) {
                    int temp = arr[inner];
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    /** Time: O(n^2) always. */
    public static void selectionSort(int[] arr) {
        for (int outer = 0; outer < arr.length - 1; outer++) {
            int min = outer;
            for (int inner = outer + 1; inner < arr.length; inner++) {
                if (arr[inner] < arr[min]) {
                    min = inner;
                }
            }
            int temp = arr[outer];
            arr[outer] = arr[min];
            arr[min] = temp;
        }
    }

    /** Time: O(n^2) worst, O(n) best (already sorted). */
    public static void insertionSort(int[] arr) {
        for (int outer = 1; outer < arr.length; outer++) {
            int key = arr[outer];
            int inner = outer - 1;

            while (inner >= 0 && arr[inner] > key) {
                arr[inner + 1] = arr[inner];
                inner--;
            }
            arr[inner + 1] = key;
        }
    }
}
