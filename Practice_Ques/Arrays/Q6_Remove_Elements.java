package Practice_Ques.Arrays;

public class Q6_Remove_Elements {
    public static void main(String[] args) {
        int [] arr = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int ans = removeElem(arr, val);
        System.out.println("Number of elements remaining after removing " + val + " : " + ans);

        System.out.print("Array after removal: ");
        for (int i = 0; i < ans; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeElem(int[]arr , int val){
        int n = arr.length;
        int k = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != val){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}
