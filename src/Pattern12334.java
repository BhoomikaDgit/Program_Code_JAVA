public class Pattern12334 {
    public static void main(String[] args) {
        int n=2*4;
        for (int row = 0; row <=n; row++) {
            for (int col = 0; col <=n; col++) {
               int atEveryIndex=4-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }

        int n1=2*4;
        for (int row = 0; row <=n1; row++) {
            for (int col = 0; col <=n1; col++) {
               int atEveryIndex=Math.min(Math.min(row,col),Math.min(n1-row,n1-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }

    }
}
