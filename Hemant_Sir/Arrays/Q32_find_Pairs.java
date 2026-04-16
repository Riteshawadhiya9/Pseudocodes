package Hemant_Sir.Arrays;
import java.util.*;

public class Q32_find_Pairs {
    public static void findPairs(int[] arr, int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    public static void findPairsOptimal(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            int elem = target - num;

            if (set.contains(elem)) {
                System.out.println(num + " + " + elem + " = " + target);
            }

            set.add(num);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;

        findPairs(arr, target);
        System.out.println("Optimal");
        findPairsOptimal(arr, target);
    }
}
