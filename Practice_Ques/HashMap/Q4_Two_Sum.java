package Practice_Ques.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class Q4_Two_Sum {
    public static void main(String[] args) {
        int [] arr = new int[]{2,7,11,15};
        int target = 9;
        int [] ans = twoSum(arr,target);
        System.out.println("Target at index : "+ Arrays.toString(ans));

    }
    private static int[] twoSum(int []arr , int target){
        HashMap<Integer , Integer> mp = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int sum = target - arr[i];
            if(mp.containsKey(sum)){
                return new int[]{mp.get(sum),i}; // get return value of that key but here the value of the sum is their index.
            }else{
                mp.put(arr[i] , i);
            }
        }
        return new int[]{-1,-1};
    }
}
