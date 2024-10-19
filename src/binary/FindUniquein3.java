package binary;

public class FindUniquein3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 2, 3,4,4, 4};
        System.out.println(findUnique(arr));  // Output: 4
    }

    public static int findUnique(int[] arr) {
        int ones = 0, twos = 0;

        for (int num : arr) {
            // `twos` holds bits that appear twice
            twos = twos | (ones & num);

            // `ones` holds bits that appear once
            ones = ones ^ num;

            // Common bits between ones and twos should be turned off, as they represent numbers appearing three times
            int common = ones & twos;
            ones &= ~common;
            twos &= ~common;
        }

        // `ones` holds the element that appears only once
        return ones;
    }
}
