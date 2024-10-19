import java.util.Arrays;

public class SetMissMatch {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 2, 6, 5};
        int[] result = missingNumber(arr);
        System.out.println(Arrays.toString(result));  // Use Arrays.toString() to print the array
    }

    public static int[] missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            // Ensure the number is within the valid range before swapping
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // After sorting, find the duplicate and missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return new int[]{arr[index], index};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
