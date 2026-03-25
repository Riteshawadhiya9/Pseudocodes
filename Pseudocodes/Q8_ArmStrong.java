package Pseudocodes;

import java.util.Scanner;

public class Q8_ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int n = num;
        int ans = 0;
        while( num > 0){
            int temp = num % 10;
            ans = ans + temp * temp * temp;
            num /= 10;
        }
        if(n == ans){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not a Armstrong");
        }
    }
}
