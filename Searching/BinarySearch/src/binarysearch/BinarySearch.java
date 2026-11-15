package binarysearch;

/**
 * Binary Search (iterative) on a sorted int array.
 * Time: O(log n)  |  Space: O(1)
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 8, 9, 11};   // must be sorted
        int result = binarySearch(array, 8);

        if (result != -1) {
            System.out.println("Element found, index is : " + result);
        } else {
            System.out.println("Element not found!");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                System.out.println("mid index : " + mid + " value : " + arr[mid]);
                low = mid + 1;
            } else {
                System.out.println("mid index : " + mid + " value : " + arr[mid]);
                high = mid - 1;
            }
        }
        return -1;
    }
}
