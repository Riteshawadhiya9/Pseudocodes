package Hemant_Sir.Arrays;
import java.util.*;

public class Q9_Seperate_Odd_Even {

    public static void separate(int[] arr) {
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }

        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];

        int i = 0, j = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even[i++] = num;
            } else {
                odd[j++] = num;
            }
        }

        System.out.print("Even array: ");
        for (int num : even) {
            System.out.print(num + " ");
        }

        System.out.print("\nOdd array: ");
        for (int num : odd) {
            System.out.print(num + " ");
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

        separate(arr);

    }
}
