package Practice_Ques.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class Q3_Contains_Duplicates {
    public static boolean isDuplicate(int[]arr){
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isDuplicate2(int[]arr){

        HashSet<Integer> st = new HashSet<>();
        for(int elem : arr){
            st.add(elem);
        }

        return st.size() != arr.length;
    }
    private static boolean isDuplicate3(int[]arr){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int elem : arr){
            if(!map.containsKey(elem)){
                map.put(elem,1);
            }else{
                int currFreq = map.get(elem);
                map.put(elem , currFreq+1);
            }
        }
        for(int elem : arr){
            if(map.get(elem) > 1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,1};

        System.out.println("isDuplicate : -> "+ isDuplicate(arr));// Brute Force -> T.C. : O(n^2)

        System.out.println("isDuplicate2 : -> "+ isDuplicate2(arr));// Brute Force -> T.C. : O(n)

        System.out.println("isDuplicate3 : -> "+ isDuplicate3(arr));// Brute Force -> T.C. : O(n)
    }
}
