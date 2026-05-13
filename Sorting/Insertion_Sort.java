package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{8,3,6,5,4,2};
        insertionSort(arr);
        System.out.print(Arrays.toString(arr)+" ");
    }
    private static void insertionSort(int[]arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int j = i;
            while(j >0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
