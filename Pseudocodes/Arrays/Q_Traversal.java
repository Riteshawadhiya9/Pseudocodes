package Pseudocodes.Arrays;

import java.util.Scanner;

public class Q_Traversal {
    public static void traversal(int[]arr){
        int n = arr.length;
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[]{1,2,3,4,5};
        traversal(arr);
    }
}
