package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q7_Check_Elem {

    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int target = sc.nextInt();

        if (contains(arr, target)) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
