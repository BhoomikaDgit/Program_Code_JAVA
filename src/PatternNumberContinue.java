//public class PatternNumberContinue {
//
//    public static void main(String[] args) {
//        int count=1;
//        for (int i = 1; i < 5; i++) {
//            int noofspace=5-i;
//            int cols=5-noofspace;
//            for (int j = 1; j <noofspace ; j++) {
//                System.out.print(" ");
//            }
////            for (int j = 1; j <= cols; j++) {
//                System.out.print(count+" ");
//                count++;
//            }
//            System.out.println();
//        }
//    }
//}
public class PatternNumberContinue {
    public static void main(String[] args) {
        int count = 1;
        int n = 4; // This controls the size of the diamond (height of top part)

        // Top half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

        // Bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}

