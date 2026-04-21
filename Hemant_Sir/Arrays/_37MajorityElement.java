import java.util.*;

public class _37MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i]=sc.nextInt();

        int count=0, candidate=0;

        for(int i:arr){
            if(count==0) candidate=i;
            if(i==candidate) count++;
            else count--;
        }

        int c=0;
        for(int i:arr) if(i==candidate) c++;

        if(c>n/2) System.out.println(candidate);
        else System.out.println(-1);
    }
}