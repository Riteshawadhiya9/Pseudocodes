package Pseudocodes.Arrays;

public class Q4_Linear_Search {
    public static boolean linearSearch(int []arr , int k){
        for(int i = 0 ; i < arr.length ;i++){
            if(arr[i] == k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int k = 4;

        if(linearSearch(arr,k)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
