package Practice.Arrays;
import java.util.*;

public class Q5_Find_Duplicates {
    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> duplicates = findDuplicates(nums);

        System.out.println("Duplicate elements: " + duplicates);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}
