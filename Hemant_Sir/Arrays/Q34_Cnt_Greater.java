package Hemant_Sir.Arrays;

import java.util.Arrays;

public class Q34_Cnt_Greater {
    private static int cnt(int []arr , int k){
        int cnt = 0;
        for(int i = 0 ;  i < arr.length ; i++){
            if(arr[i] >= k)cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{6,2,4,2,6,7,22,5,22,4,19};
        int x = 6;
        System.out.println("Original Array : "+ Arrays.toString(arr));
        System.out.println("Total cnt of  "+x + " is  : "+cnt(arr,x));
    }
}
