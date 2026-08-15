package Arrays_Interview_Ques;

public class Q3_Find_Missing {
    public static void main(String[] args) {
        int[] num = {9,6,4,2,3,5,7,0,1};
        int ans = findMissing(num);
        System.out.println("The missing element is  : "+ans);
    }
    private static int findMissing(int[]arr){
        int n = arr.length;
        int cnt = 0;
        for(int i  : arr){
            cnt += i;
        }

        int totalCnt = (n*(n+1))/2;

        int ans = totalCnt - cnt;
        return ans;
    }
}
