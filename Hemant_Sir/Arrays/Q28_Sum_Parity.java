package Hemant_Sir.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q28_Sum_Parity {
    public static void sumEven_sumOdd(int[]arr){
        int n = arr.length;
        int evenSum = 0;
        int oddSum = 0;
        for(int i : arr){
            if(i % 2 == 0){
                evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.println("OddSum : "+ oddSum);
        System.out.println("EvenSum : "+ evenSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        sumEven_sumOdd(arr);
    }
}
