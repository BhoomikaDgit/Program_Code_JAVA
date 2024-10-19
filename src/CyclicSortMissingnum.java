import java.util.ArrayList;
import java.util.List;

public class CyclicSortMissingnum {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(findMissingNum(arr));
    }

    public static List<Integer> findMissingNum(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // Ensure nums[i] is not 0, as it will result in -1 for index
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        // Find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
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
