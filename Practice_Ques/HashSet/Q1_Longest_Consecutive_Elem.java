package Practice_Ques.HashSet;

import java.util.HashSet;

public class Q1_Longest_Consecutive_Elem {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};

        int ans = longestConsecutive(arr);

        System.out.println("Length of the longest consecutive sequence = " + ans);
    }

    private static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Store all elements in the HashSet
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        // Check every possible starting element
        for (int num : set) {
            if (!set.contains(num - 1)) {   // Start of a sequence
                int currNum = num;
                int currStreak = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                maxLen = Math.max(maxLen, currStreak);
            }
        }

        return maxLen;
    }
}