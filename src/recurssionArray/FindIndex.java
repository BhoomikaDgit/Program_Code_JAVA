package recurssionArray;

public class FindIndex {
    public static void main(String[] args) {
int[] arr={4,3,2,1,5,7};
        System.out.println(findIndex(arr,3,0));
    }
    static  int findIndex(int[] arr,int target,int index){
        if(index==arr.length) {
            return -1;
        }
        if( arr[index]==target ) {
            return index;
        }else{

            return findIndex(arr,target,index+1);
        }

    }
}
