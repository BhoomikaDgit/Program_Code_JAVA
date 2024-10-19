package binary;

public class OneUnique {
    public static void main(String[] args) {
        int[] arr={3,2,1,1,8,3,2};
        System.out.println(whichUnique(arr));
    }

    private static int whichUnique(int[] arr) {
        int unique=0;
        for (int n:arr){
            unique=unique^n;
        }
        return unique;
    }
}
