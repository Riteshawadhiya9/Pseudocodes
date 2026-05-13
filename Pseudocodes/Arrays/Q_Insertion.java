package Pseudocodes.Arrays;
import java.util.*;

public class Q_Insertion {
    static void insert(int[] arr, int n, int pos, int value) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();
        int value = sc.nextInt();

        insert(arr, n, pos, value);

        System.out.println(Arrays.toString(arr));
    }
}
