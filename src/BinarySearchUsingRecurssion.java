public class BinarySearchUsingRecurssion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=3;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target, int s,int end){
        if(s>end){
            return -1;
        }
        int m=s+(end-s)/2;
        if(arr[m]==target) {
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,end);
    }
}
