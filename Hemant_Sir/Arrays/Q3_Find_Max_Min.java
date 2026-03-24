package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q3_Find_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;



        System.out.println(min +" "+ max);
    }
}
