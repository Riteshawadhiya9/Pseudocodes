package Hemant_Sir.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q30_Replace_0_to_1 {
    private static int[] replace_0_to_1(int[]arr){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] <= 0){
                arr[i] = 1;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]arr = new int[] {0,0,0,32,9,0,0,22,33,444,367,0,0};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        replace_0_to_1(arr);
        System.out.println("After replacing : "+ Arrays.toString(arr));
    }
}
