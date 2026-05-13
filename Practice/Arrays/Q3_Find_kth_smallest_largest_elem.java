package Practice.Arrays;

import java.util.Arrays;

public class Q3_Find_kth_smallest_largest_elem {
    private static int secMax(int[]arr){
        int n = arr.length;
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;
        for(int i = 1; i < n ; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax && max != arr[i]){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static int kthSmallest(int []arr , int k){ // Brute -> T.C.-> O(n log n)
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static int kthlargest(int[]arr , int k){// Brute -> T.C.-> O(n log n)
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n-k];
    }
    public static void main(String[] args) {
        int [] arr = new int[]{7,10,4,3,20,15};
        int k = 3;
        System.out.println(Arrays.toString(arr));
        System.out.println("SecMax : "+secMax(arr));
        System.out.println("kthSmallest -> "+ kthSmallest(arr,k));
        System.out.println("kthLargest -> "+ kthlargest(arr,k));
    }
}
//Input: arr = [7, 10, 4, 3, 20, 15], k = 3
//kth smallest = 7
//kth largest = 10