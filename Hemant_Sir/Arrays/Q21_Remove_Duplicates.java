package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q21_Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicate(arr);
        System.out.println("No.Of duplicates elements is : "+ans);
    }

    private static int removeDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;
        for(int j = 1  ; j < n ; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
