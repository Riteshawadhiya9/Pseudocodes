package Pseudocodes;
import java.util.*;
public class Q6_Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n>0){
            int temp = n % 10;
            ans = ans*10 + temp;
            n = n/10;
        }
        System.out.println(ans);
    }
}


//START
//
//DECLARE n, ans, temp : INTEGER
//
//PRINT "Enter a number"
//READ n
//
//SET ans ← 0
//
//WHILE n ≠ 0
//  temp ← n MOD 10
//  ans ← ans × 10 + temp
//  n ← n/10
//END WHILE
//
//PRINT "Reversed Number =", ans
//
//END