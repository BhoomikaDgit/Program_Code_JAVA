package sort;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 1};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) { // Start from the second element
            for (int j = i+1; j > 0; j--) { // Compare current element with previous elements
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1); // Swap if the current element is smaller
                } else {
                    break; // Break if no swap is needed
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
