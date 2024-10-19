package recurssion;

public class Nto1 {
    public static void main(String[] args) {
        fun(1);
    }
    static void fun(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        fun(n+1);
        System.out.println();
        System.out.println(n);
    }
}
