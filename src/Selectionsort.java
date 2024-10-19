import java.util.Arrays;

public class Selectionsort {
    private static int[] arr;

    public static void main(String[] args) {
        int[] arr= {3,2,1,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMaxindex(arr,0,last);
swap(arr,maxIndex,last);
        }
    }

static void swap(int[] arr,int first,int secod){
        int temp=arr[first];
        arr[first]=arr[secod];
        arr[secod]=temp;
}
    private static int  getMaxindex(int[] arr, int start, int end) {
   int max=start;
        for (int i = 0; i <= end; i++) {
           if(arr[max]<arr[i]) {
              max=i;
           }
        }
   return max;
    }
}
