package Hemant_Sir.Arrays;
import java.util.*;

public class Q16_Right_Shift {
    public static void rightShift(int[] arr) {
        if (arr.length == 0) return;

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
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

        rightShift(arr);

        System.out.print("Array after right shift: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
