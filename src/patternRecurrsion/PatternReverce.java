package patternRecurrsion;

public class PatternReverce {
    public static void main(String[] args) {
traiangle(4,0);
    }
    static void traiangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            traiangle(r,c+1);
            System.out.print("*");
        }else{
            traiangle(r-1,0);
            System.out.println();
        }
    }
}
