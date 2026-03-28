package Hemant_Sir.Arrays;
import java.util.Scanner;

public class Q14_Find_idx_last_Occurrence {


    public static int findLastIndex(int[] arr, int target) {
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                idx = i;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find: ");
        int target = sc.nextInt();

        int index = findLastIndex(arr, target);

        if (index != -1) {
            System.out.println("Last occurrence at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
