public class Pyramid123 {
    public static void main(String[] args) {

        for (int row = 0; row <=2*5; row++) {
            int c=row>5?2*5-row:row;
            for (int j = 0; j <5-c ; j++) {
                System.out.print("  ");
            }
            for (int col = c; col >=1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=c ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();

        }
    }
}
