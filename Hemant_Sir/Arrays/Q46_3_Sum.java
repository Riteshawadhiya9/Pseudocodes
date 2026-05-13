package Hemant_Sir.Arrays;

import java.util.*;

public class Q46_3_Sum {

    public static List<List<Integer>> threeSum(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < n - 2; i++){

            // Skip duplicate values for i
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int l = i + 1;
            int r = n - 1;

            while(l < r){
                int sum = arr[i] + arr[l] + arr[r];

                if(sum == 0){
                    res.add(Arrays.asList(arr[i], arr[l], arr[r]));

                    l++;
                    r--;

                    // Skip duplicates
                    while(l < r && arr[l] == arr[l-1]) l++;
                    while(l < r && arr[r] == arr[r+1]) r--;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(arr);

        System.out.println("Input Array: " + Arrays.toString(arr));
        System.out.println("Unique triplets whose sum is 0:");

        if(result.isEmpty()){
            System.out.println("No triplets found.");
        } else {
            for(List<Integer> triplet : result){
                System.out.println("Triplet: " + triplet);
            }
        }
    }
}