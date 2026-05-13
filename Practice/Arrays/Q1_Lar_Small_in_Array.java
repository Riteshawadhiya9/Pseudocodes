package Practice.Arrays;

import java.util.*;

public class Q1_Lar_Small_in_Array {
    public static int[] findMax_MIN(int[]arr ){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            max = Math.max(num,max);
        }
        for(int num : arr){
            min = Math.min(num, min);
        }
        return new int[]{max,min};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[]{12,22,323,42323,512,2416,-1,0,9,10};
        System.out.println(Arrays.toString(arr));
        int [] ans = findMax_MIN(arr);
        System.out.println("Max : "+ans[0]);
        System.out.println("Min : "+ans[1]);
    }
}
