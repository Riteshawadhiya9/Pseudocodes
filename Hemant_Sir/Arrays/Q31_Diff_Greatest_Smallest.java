package Hemant_Sir.Arrays;

public class Q31_Diff_Greatest_Smallest {
    private static int findDifference(int[] arr) {

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2, 20};

        int diff = findDifference(arr);

        System.out.println("Difference: " + diff);

    }
}
