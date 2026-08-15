package Arrays_Interview_Ques;

import java.util.Arrays;

public class Q1_Reverse_an_Array {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,8,10};

        revArray(arr);
//        revRecursive(arr,0,arr.length-1);


//        for(int i : arr){
//            System.out.print(i +" ");
//        }
        System.out.print(Arrays.toString(arr)+" ");


    }
    private static void revArray(int[]arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            swap(i,j,arr);
            i++;
            j--;
        }
    }
    private static void swap(int i ,int j , int[]arr){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }

    private static void revRecursive(int[]arr , int i , int j){
        if(i >= j){
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        revRecursive(arr,i+1,j-1);
    }
}
