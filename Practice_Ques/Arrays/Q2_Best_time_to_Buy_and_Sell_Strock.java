package Practice_Ques.Arrays;

public class Q2_Best_time_to_Buy_and_Sell_Strock {
    public static void main(String[] args) {
        int[] arr = new  int[]{7,1,5,3,6,4};
        int ans = maxProfit(arr);
        System.out.println("Max Profit is : "+ans);

    }
    private static int maxProfit(int[]arr){
        int buy = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(buy < arr[i]){
                int profit = arr[i] - buy;
                max  = Math.max(profit,max);
            }else{
                buy = arr[i];
            }
        }
        return  max;
    }
}
