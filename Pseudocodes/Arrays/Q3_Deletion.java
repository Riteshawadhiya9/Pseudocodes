package Pseudocodes.Arrays;
import java.util.*;
public class Q3_Deletion {
    static void delete(int[] arr, int n, int pos) {
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();

        delete(arr, n, pos);

        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
