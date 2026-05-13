package Hemant_Sir.Arrays;
import java.util.*;

public class Q38_Intersection_two_Arrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        int[] temp = new int[Math.min(nums1.length, nums2.length)];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                temp[k++] = nums1[i];
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};

        int[] result = intersect(arr1, arr2);

        System.out.println("Intersection of arrays: " + Arrays.toString(result));
    }
}
