package Sorting;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{7,6,4,3,2,1,0};
        bubbleSort(arr);
        System.out.print(Arrays.toString(arr)+" ");
    }
    private static void bubbleSort(int[]arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            boolean flag = false;
            for(int j = 0 ; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag==false){
                return;
            }
        }
    }
}
