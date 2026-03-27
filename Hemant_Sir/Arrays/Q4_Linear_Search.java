package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q4_Linear_Search {

    public static boolean ls(int[]arr , int n){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == n) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];

        System.out.println("Enter "+n+" elements ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Which element you want to search : ");
        int x = sc.nextInt();

        System.out.println(ls(arr,x));
    }
}
