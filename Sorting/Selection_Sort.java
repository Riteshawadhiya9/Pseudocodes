package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,4,5,1,2};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr)+" ");
    }
    private static void selectionSort(int[]arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1; i++){
            int min_Idx = i;
            for(int j = i+1 ; j < n ; j++) {
                if (arr[j] < arr[min_Idx]) {
                    min_Idx = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[min_Idx];
                arr[min_Idx] = temp;
        }
    }
}
