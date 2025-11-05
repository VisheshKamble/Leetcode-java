import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }

    // Insertion Sort function
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];   // element to be placed
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            // Place the key at correct position
            arr[j + 1] = key;
        }
    }
}
