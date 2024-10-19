import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] a = {1, 8, 7, 6, 5, 4, 3, 2};
        sort(a);
        System.out.println(Arrays.toString(a));

    }

    static void sort(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if ((a[i] ) != a[correct]) {
                swap(a, i, correct);
            } else {
                i++;
            }

        }


    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }

}
