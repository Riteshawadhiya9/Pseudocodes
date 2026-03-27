package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q6_Replace_Occurrence {
    public static void replaceElement(int[] arr, int target, int replacement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                arr[i] = replacement;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to replace: ");
        int target = sc.nextInt();

        System.out.print("Enter new value: ");
        int replacement = sc.nextInt();

        replaceElement(arr, target, replacement);

        System.out.println("Updated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
