import java.util.*;

public class _39UnionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i=0;i<n1;i++) a[i]=sc.nextInt();

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int i=0;i<n2;i++) b[i]=sc.nextInt();

        Set<Integer> set = new LinkedHashSet<>();

        for(int i:a) set.add(i);
        for(int i:b) set.add(i);

        for(int i:set) System.out.print(i+" ");
    }
}