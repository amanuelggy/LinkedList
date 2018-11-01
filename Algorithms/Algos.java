import java.util.Arrays;

public class Algos {

    // k largest elements in an array | added Min Heap method
    public int[] largestKints(int[] arr, int k) {
        int[] largestKints = new int[k];
        bubleSortDecrement(arr);
        System.out.println("sorted: " + Arrays.toString(arr));
        for (int i = 0; i < k; ++i) {
            largestKints[i] = arr[i];
        }
        System.out.println("Largest " + k + " numbers are: " + Arrays.toString(largestKints));
        return largestKints;

    }

    // k smallest elements in an array | added Min Heap method
    public int[] smallestKints(int[] arr, int k) {
        int[] smallestKints = new int[k];
        bubleSort(arr);
        System.out.println("sorted: " + Arrays.toString(arr));
        for (int i = 0; i < k; ++i) {
            smallestKints[i] = arr[i];
        }
        System.out.println("Smallest " + k + " numbers are: " + Arrays.toString(smallestKints));
        return smallestKints;
    }

    // Bubble sort smallest to largest
    public int[] bubleSort(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    // Bubble sort largest to smallest
    public int[] bubleSortDecrement(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("Reverse sorted: " + Arrays.toString(arr));
        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Algos algo = new Algos();
        int[] arr = { 6, 5, 4, 3, 2, 1, 0 };
        // int[] arr2 = { 0, 1, 2, 3, 4, 5, 6, 7 };
        algo.largestKints(arr, 4);
        algo.smallestKints(arr, 3);
        // algo.bubleSortDecrement(arr2);

    }
}