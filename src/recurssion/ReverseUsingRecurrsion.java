package recurssion;

public class ReverseUsingRecurrsion {
    public static void main(String[] args) {
        System.out.println(fun(59898));

    }
    static int sum=0;
    static int fun(int n){
        if(n==0){
            return sum;
        }
        int rem=n%10;
        sum=sum*10+rem;
      return  fun(n/10);

    }
}
