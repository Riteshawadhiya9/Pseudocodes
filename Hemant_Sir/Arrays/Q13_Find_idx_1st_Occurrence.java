package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q13_Find_idx_1st_Occurrence {

    public static int findFirstIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find: ");
        int target = sc.nextInt();

        int index = findFirstIndex(arr, target);

        if (index != -1) {
            System.out.println("First occurrence at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
