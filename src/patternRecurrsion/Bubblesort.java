package patternRecurrsion;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
   int[] arr={5,4,32,2};
   bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static  void bubble(int[] arr, int last,int fst){
        if(last==0){
            return;
        }
        if(fst<last){
            if(arr[fst]>arr[fst+1]){
                int temp=arr[fst];
                arr[fst]=arr[fst+1];
                arr[fst+1]=temp;
            }
            bubble(arr,last,fst+1);
        }else{
            bubble(arr,last-1,fst);
        }

    }
}
