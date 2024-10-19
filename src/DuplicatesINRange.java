import java.util.ArrayList;
import java.util.List;

public class DuplicatesINRange {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 3, 5, 2, 6, 3};
        List<Integer> duplicates = findDuplicates(arr);
        System.out.println(duplicates);  // Print the result for verification
    }

    public static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Ensure arr[i] is within the valid range (1 to arr.length) before swapping
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Collect duplicates
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1 && !ans.contains(arr[index])) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
