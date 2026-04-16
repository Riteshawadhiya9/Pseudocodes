package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q23_Reverse_Array {
    public static void rev(int[]arr){
        int i = 0 ;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[]{1,2,3,4,5};
        for(int num : arr){
            System.out.print(num+" ");
        }
        rev(arr);
        System.out.println();
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
