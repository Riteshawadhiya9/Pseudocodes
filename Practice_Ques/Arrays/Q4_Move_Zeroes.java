package Practice_Ques.Arrays;

import java.util.Arrays;

public class Q4_Move_Zeroes {
    private static void moveZero(int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{0,1,1,0,0,1,1,0};
        moveZero(arr);

        System.out.println(Arrays.toString(arr));
    }
}
