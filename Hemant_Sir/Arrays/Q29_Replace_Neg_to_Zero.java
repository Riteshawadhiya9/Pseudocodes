package Hemant_Sir.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q29_Replace_Neg_to_Zero {
    public static int[] replace_Neg_Zero(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[]{1,2,-3,-1,-3,1,2,44,-234,-42,4};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        replace_Neg_Zero(arr);
        System.out.print("After replace : "+Arrays.toString(arr)+ " ");
    }
}
