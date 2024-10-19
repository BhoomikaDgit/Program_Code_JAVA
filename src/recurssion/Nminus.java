package recurssion;

public class Nminus {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
//        fun(n--); it will pass 5 first and then 5-1 again it will fist pass 5 only so stack overflow
        fun(--n);
    }
}
