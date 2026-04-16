package Hemant_Sir.Arrays;

import java.util.Scanner;

public class Q20_Second_Smallest {
    public static int findSecondSmallest(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] < secMin && arr[i] != min) {
                secMin = arr[i];
            }
        }

        return secMin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 1, 2, 0, 332, 1, 222};
        int ans = findSecondSmallest(arr);
        System.out.println(ans);
    }
}
