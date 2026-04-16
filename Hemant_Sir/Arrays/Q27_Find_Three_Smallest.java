package Hemant_Sir.Arrays;

public class Q27_Find_Three_Smallest {

    public static void findThreeSmallest(int[] arr) {

        if (arr.length < 3) {
            System.out.println("Array must have at least 3 elements");
            return;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for (int num : arr) {

            if (num < first) {
                third = second;
                second = first;
                first = num;

            } else if (num < second && num != first) {
                third = second;
                second = num;

            } else if (num < third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Three smallest elements are: "
                + first + ", " + second + ", " + third);
    }


    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 50, 23, 90};

        findThreeSmallest(arr);
    }
}
