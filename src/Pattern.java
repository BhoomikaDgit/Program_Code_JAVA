public class Pattern {
    public static void main(String[] args) {
        int n=4;
        for (int row = 0; row < 2*n; row++) {
          int noOFcols=row>n?2*n-row:row;
          int noOfspace=n-noOFcols;
            for (int i = 0; i < noOfspace; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < noOFcols; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        }

    }

