import java.util.*;

public class _45LongestDistinctSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int max=0;

        for(int i=0;i<n;i++){
            boolean[] seen = new boolean[10000];
            int count=0;

            for(int j=i;j<n;j++){
                if(seen[arr[j]]) break;
                seen[arr[j]] = true;
                count++;
            }

            if(count>max) max=count;
        }

        System.out.println(max);
    }
}