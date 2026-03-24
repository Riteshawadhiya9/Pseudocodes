package HackerEarth_Ques;
import java.util.*;
public class Its_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int index = -1;

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }

        for (int j = 0; j < n; j++) {
            if ((sum - a[j]) % 7 == 0 && a[j] < min) {
                min = a[j];
                index = j;
            }
        }

        System.out.println(index);  // 14 7 8 4 2
    }
}
