package recurssion;

public class Productofdigits {
    public static void main(String[] args) {
        int ans=prod(55);
        System.out.println(ans);
    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return (n/10)*(n%10);
    }
}
