package Arrays_Interview_Ques;

public class Q2_Find_Min_Max {
    public static void main(String[] args) {
        int [] arr = new int[]{2,4,1,8,10,383,1093,282,273,272,7,51,};
        findMinMax(arr);
    }
    private static void findMinMax(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i : arr){
            min = Math.min(min,i);
        }

        for(int i : arr){
            max = Math.max(max,i);
        }

        System.out.println("MAX : "+max);
        System.out.println("MIN : "+min);
    }
}
