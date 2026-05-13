package Pseudocodes.Arrays;

public class Q_Binary_search {
    public static boolean binarySearch(int[] arr, int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        while(st < end){
            int mid = (st+end)/2;
           if(arr[mid] == target){
               return true;
           }else if(arr[mid] > target){
               end = mid +- 1;
           }else{
               st = mid+1;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5,6,7,8,9};
        int target = 2;


        if(binarySearch(arr,target)){
            System.out.println("Exists");
        }else{
            System.out.println("Not Exists");
        }
    }
}
