package Practice.Arrays;

import java.util.*;

public class Q4_Find_Missing_elem {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6,7,8,9,10};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Missing elem is : -> "+findElem(arr));
    }

    private static int findElem(int[]arr){
        int n = arr.length;
        int expectedSum = (n + 1) * (n + 2) / 2; // sum from 1 to n+1
        int actualSum = arrSum(arr);

        return expectedSum - actualSum;
    }
    private static int arrSum(int [] arr){
        int n = arr.length;
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
