package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q18_Sort_Descending {
    public static void bubbleSortDesc(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
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

        bubbleSortDesc(arr);

        System.out.print("Sorted array (Descending): ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
