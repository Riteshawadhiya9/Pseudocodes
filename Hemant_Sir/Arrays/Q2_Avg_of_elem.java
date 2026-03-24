package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q2_Avg_of_elem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0 ;i  < n ;  i++){
            arr[i] = sc.nextInt();
            cnt++;
        }
        for(int i : arr){
            sum += i;
        }
        int avg = sum/cnt;
        System.out.println(avg);
    }
}
