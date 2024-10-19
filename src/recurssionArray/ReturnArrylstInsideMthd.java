package recurssionArray;

import java.util.ArrayList;

public class ReturnArrylstInsideMthd {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5,2,4};
        System.out.println(findAllIdex2(arr,4,0));

    }
    static ArrayList<Integer> findAllIdex2(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFrom=findAllIdex2(arr, target, index+1);
        list.addAll(ansFrom);
        return  list;
    }
}

