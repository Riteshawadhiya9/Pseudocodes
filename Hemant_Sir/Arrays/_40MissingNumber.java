import java.util.*;

public class _40MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n-1];

        for(int i=0;i<n-1;i++) arr[i]=sc.nextInt();

        int sum = n*(n+1)/2;
        int s=0;

        for(int i:arr) s+=i;

        System.out.println(sum-s);
    }
}