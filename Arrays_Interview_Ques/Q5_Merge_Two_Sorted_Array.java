package Arrays_Interview_Ques;

import java.util.Arrays;

public class Q5_Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int [] a = {1,3,5,7};
        int [] b = {2,4,6,8,10};

        int [] ans = merge(a,b);
        System.out.println("Sorted Array : "+Arrays.toString(ans));
    }

    private static int[] merge(int [] arr , int [] brr){

        int a = arr.length;
        int b = brr.length;

        int c = a + b;
        int [] crr = new int[c];

        int i = 0 ;
        int j = 0;
        int k = 0;

        while( i < a  && j < b){
            if(arr[i] <= brr[j]){
                crr[k] = arr[i];
                i++;
            }else{
                crr[k] = brr[j];
                j++;
            }
            k++;
        }

        while(i < a){
            crr[k] = arr[i];
            i++;
            k++;
        }

        while(j < b){
            crr[k] = brr[j];
            j++;
            k++;
        }
        return crr;
    }
}
