package Hemant_Sir.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q36_Alternate_Parity {
    private static int[] rearrangeParity(int []nums){
         int n = nums.length;
         int[] pos = new int[n / 2];
         int[] neg = new int[n / 2];
         int x = 0;
         int y = 0;
         for (int i = 0; i < n; i++) {
             if (nums[i] > 0) {
                 pos[x++] = nums[i];
             } else {
                 neg[y++] = nums[i];
             }
         }
         int p = 0;
         for (int i = 0; i < n; i += 2) {
             nums[i] = pos[p++];
         }
         int q = 0;
         for (int i = 1; i < n; i += 2) {
             nums[i] = neg[q++];
         }
         return nums;
    }
    private static int[] rearrangeArray(int[]nums){
        int n = nums.length;
        int [] arr = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] > 0){
                arr[pos] = nums[i];
                pos += 2;
            }else{
                arr[neg] = nums[i];
                neg += 2;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of positives == number of negatives");
        int[] arr = new int[]{3,1,-2,-5,2,-4};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        rearrangeParity(arr);
        System.out.println("After rearrange : "+Arrays.toString(arr));
        rearrangeArray(arr);
        System.out.println("A bit optimal : "+Arrays.toString(arr));
    }
}
