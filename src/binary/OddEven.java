package binary;

public class OddEven {
    public static void main(String[] args) {
        int n=10;
        System.out.println(issOdd(n));
    }

    private static boolean issOdd(int n) {
        return (n&1)==1;
    }
}
