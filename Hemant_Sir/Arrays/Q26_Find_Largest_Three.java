package Hemant_Sir.Arrays;

public class Q26_Find_Largest_Three {

    public static void findThreeLargest(int[] arr) {

        if (arr.length < 3) {
            System.out.println("Array must have at least 3 elements");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {
                third = second;
                second = first;
                first = num;

            } else if (num > second && num != first) {
                third = second;
                second = num;

            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Three largest elements are: "
                + first + ", " + second + ", " + third);
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};

        findThreeLargest(arr);
    }
}
