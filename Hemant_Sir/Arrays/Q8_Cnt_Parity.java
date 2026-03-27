package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q8_Cnt_Parity {

    public static void parity(int[] arr) {
        int cntEven = 0;
        int cntOdd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                cntEven++;
            } else {
                cntOdd++;
            }
        }

        System.out.println("Even count = " + cntEven);
        System.out.println("Odd count = " + cntOdd);
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

        parity(arr);
    }
}
