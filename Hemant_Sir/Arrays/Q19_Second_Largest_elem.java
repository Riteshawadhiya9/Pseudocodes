package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q19_Second_Largest_elem {
    public static int findSecMax(int[]arr){
        int n = arr.length;
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;

        for(int i = 1 ; i < n ; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax && arr[i] != max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[]{1,2,1,2,1,332,1,222};
        int ans = findSecMax(arr);
        System.out.println(ans);
    }
}
