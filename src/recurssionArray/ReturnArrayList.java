package recurssionArray;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr={2,1,5,5,3,4,3,5};
        ArrayList<Integer> ans= findAllIndex(arr,5,0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return  findAllIndex(arr, target, index+1, list);
    }
}
