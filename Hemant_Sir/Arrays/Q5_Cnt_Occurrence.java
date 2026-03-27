package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q5_Cnt_Occurrence {

    public static int countOccurrence(int[] arr, int target) {
        int cnt = 0;
        for (int num : arr) {
            if (num == target) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to find its occurrence: ");
        int target = sc.nextInt();

        int result = countOccurrence(arr, target);
        System.out.println("Total occurrences of " + target + " = " + result);

    }
}