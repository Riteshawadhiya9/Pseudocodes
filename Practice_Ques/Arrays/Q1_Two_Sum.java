package Practice_Ques.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q1_Two_Sum {
    private static int[] bruteForce(int[]arr , int target){
        int n = arr.length;
        for(int i = 0; i<n ; i++){
            for(int j = i+1 ; j < n ;j++){
                if(arr[i] + arr[j] == target){
                    int[]ans = {i,j};
                    return ans;
                }
            }
        }
        return null;
    }

    private static boolean isTwoSum(int []ans , int target){
        int i = 0;
        int j = ans.length - 1;

        // Created a copy of the array because sorting directly
        // was modifying the original array reference,
        // which caused incorrect output in other methods.
        int[] brr = Arrays.copyOf(ans,ans.length);

        Arrays.sort(brr);

        while(i < j){
            int sum = brr[i] + brr[j];
            if(sum == target){
                return true;
            }else if(sum < target){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }

    private static int[] usingHashMap(int[]arr , int target){
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int sum = target - arr[i];
            if(mp.containsKey(sum)){
                return new int[]{mp.get(sum) , i};
            }else{
                mp.put(arr[i] , i);
            }
        }
        return  new int[]{-1,-1};
    }

    private static boolean usingHashSet(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int ans = target - num;
            if (set.contains(ans)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1, -2, -3, -4, -5};
        int target = -8;

        int []ans = bruteForce(arr , target);
        System.out.println("Indices: " + Arrays.toString(ans));

        System.out.println(isTwoSum(arr,target));

        int[]res = usingHashMap(arr,target);
        System.out.println("Indices: " + Arrays.toString(res));

        System.out.println(usingHashSet(arr,target));


    }
}


//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]