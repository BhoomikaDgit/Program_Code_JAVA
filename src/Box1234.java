public class Box1234 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                if(j==1||i==1||j==4||i==4){
                    System.out.print(5);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
