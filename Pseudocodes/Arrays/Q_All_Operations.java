package Pseudocodes.Arrays;
import java.util.*;
public class Q_All_Operations {
    static void traversal(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int[] insertion(int[] arr, int n, int pos, int value) {
        int[] newArr = new int[n + 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = value;
        for (int i = pos; i < n; i++) {
            newArr[i + 1] = arr[i];
        }
        return newArr;
    }

    static int[] deletion(int[] arr, int n, int pos) {
        int[] newArr = new int[n - 1];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        for (int i = pos + 1; i < n; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }

    static boolean linearSearch(int[] arr, int key) {
        for (int i : arr) {
            if (i == key) return true;
        }
        return false;
    }

    static boolean binarySearch(int[] arr, int target) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;

            if (arr[mid] == target) return true;
            else if (arr[mid] > target) end = mid - 1;
            else st = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        traversal(arr);

        arr = insertion(arr, arr.length, 2, 99);
        traversal(arr);

        arr = deletion(arr, arr.length, 3);
        traversal(arr);

        System.out.println(linearSearch(arr, 4));
        System.out.println(binarySearch(arr, 4));
    }
}

