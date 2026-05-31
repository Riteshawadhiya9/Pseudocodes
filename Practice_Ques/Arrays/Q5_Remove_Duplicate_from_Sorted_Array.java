package Practice_Ques.Arrays;

import java.util.Arrays;

public class Q5_Remove_Duplicate_from_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println("Original Array : "+ Arrays.toString(arr));
        int ans = removeDuplicate(arr);
        System.out.println("Length after removing duplicates: " + ans);
        System.out.println("Unique elements: " + Arrays.toString(Arrays.copyOf(arr, ans)));
    }

    private static int removeDuplicate(int [] arr){
        int i = 0;
        for(int j = 1; j < arr.length ; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
