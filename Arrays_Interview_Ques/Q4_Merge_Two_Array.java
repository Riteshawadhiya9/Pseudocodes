package Arrays_Interview_Ques;

import java.util.Arrays;

public class Q4_Merge_Two_Array {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,3,4,105};
        int [] b = new int[]{4,5,6,7,8,9,10};

        int [] ans  = merge(a,b);
        System.out.println(Arrays.toString(ans));

    }
    private static int[] merge(int[] arr , int [] brr){
        int a = arr.length;
        int b = brr.length;
        int c = a+b;
        int [] crr = new int [c];

        for(int i = 0 ; i < a ; i++){
            crr[i] = arr[i];
        }

        for(int i = 0 ; i < b ; i++){
            crr[a + i] = brr[i];
        }

        return crr;
    }
}
