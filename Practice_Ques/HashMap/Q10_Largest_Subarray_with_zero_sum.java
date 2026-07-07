package Practice_Ques.HashMap;

import java.util.HashMap;
import java.util.Map;

// 1. Calculate Prefix Sum while traversing the array.
// 2. If the same Prefix Sum appears again,
//    then the subarray between the two indices has sum = 0.
// 3. Store only the first occurrence of every Prefix Sum
//    to get the maximum possible length.

public class Q10_Largest_Subarray_with_zero_sum {

    public static void main(String[] args) {

        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};

        int ans = maxLength(arr);

        System.out.println("Largest Zero Sum Subarray Length = " + ans);
    }

    public static int maxLength(int[] arr) {

        // Stores:
        // Prefix Sum -> First Index where it appeared
        Map<Integer, Integer> mp = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        // Prefix Sum 0 is considered at index -1
        mp.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            if (mp.containsKey(prefixSum)) {

                maxLength = Math.max(maxLength, i - mp.get(prefixSum));

            } else {

                // Store only the first occurrence
                mp.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}