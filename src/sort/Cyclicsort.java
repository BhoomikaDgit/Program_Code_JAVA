package sort;

import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,32};
sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] < arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }}
        static void swap(int[] arr,int fst,int second){
            int temp=arr[fst];
            arr[fst]=arr[second];
            arr[second]=temp;

    }
}
