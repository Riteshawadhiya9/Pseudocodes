package Hemant_Sir.Arrays;

public class Q37_Majority_elem {
    public static int findMajority(int[] nums) {
        int count = 0, candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        count = 0;
        for (int num : nums) {
            if (num == candidate) count++;
        }

        return count > nums.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 2, 2, 2};
        int result = findMajority(nums);

        if (result != -1) {
            System.out.println("Majority element is: " + result);
        } else {
            System.out.println("No majority element found");
        }
    }
}
