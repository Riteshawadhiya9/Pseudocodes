package Hemant_Sir.Arrays;
import java.util.*;

public class Q15_Left_Shift {
    public static void leftShift(int[] arr) {
        if (arr.length == 0) return;

        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
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

        leftShift(arr);

        System.out.print("Array after left shift: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
