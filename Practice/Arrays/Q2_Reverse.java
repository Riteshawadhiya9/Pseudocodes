package Practice.Arrays;

import java.util.Arrays;

public class Q2_Reverse {
    private static int[] rev(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Reverse Array : "+Arrays.toString(rev(arr)));
    }
}
