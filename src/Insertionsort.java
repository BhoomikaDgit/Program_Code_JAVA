import java.util.Arrays;

public class Insertionsort {

        private static int[] arr;

        public static void main(String[] args) {
            int[] arr= {34,0,9,0,51,4};
            insertion(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void insertion(int[] arr){
            for (int i=0;i<arr.length-1;i++){
                for (int j = i+1; j >0 ; j--) {
                    if(arr[j]<arr[j-1]){
                        swap(arr,j,j-1);
                    }else{
                        break;
                    }
                }

            }
        }

        static void swap(int[] arr,int first,int secod){
            int temp=arr[first];
            arr[first]=arr[secod];
            arr[secod]=temp;
        }

    }


