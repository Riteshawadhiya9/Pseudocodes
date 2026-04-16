package Hemant_Sir.Arrays;

import java.util.*;

public class Q22_Cnt_frequency {
    static HashMap<Integer, Integer> frequency(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};

        HashMap<Integer, Integer> result = frequency(arr);

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
