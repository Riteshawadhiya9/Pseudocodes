package Hemant_Sir.Arrays;

import java.util.Arrays;

public class Q24_Right_Rotate_by_K {

    public static void rev(int []arr , int i , int j){
       while(i < j){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
    }
    public static void rotate(int[]arr, int k){
        int n = arr.length;
        k = k%n;
        rev(arr,0,n-k-1);
        rev(arr,n-k,n-1);
        rev(arr,0,n-1);
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
