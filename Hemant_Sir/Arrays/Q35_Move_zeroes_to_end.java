package Hemant_Sir.Arrays;
import java.util.*;

public class Q35_Move_zeroes_to_end {

    public static void moveZeros(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        moveZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}
