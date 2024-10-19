package recurssionArray;

import java.util.ArrayList;
import java.util.List;

public class ReturnAllTarget {
    public static void main(String[] args) {
        int[] arr={1,5,4,3,2,5,5,2,4,3,6,5};
findall(arr,5,0);
        System.out.println(ls);
    }
    static List<Integer> ls=new ArrayList();
    static  void findall(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            ls.add(index);
        }
        findall(arr,target,index+1);
    }

}
