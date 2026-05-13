package Hemant_Sir.Strings;

import java.util.Scanner;

public class Q2_Reverse_String_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ans = sb + "";
        System.out.println(ans);
    }
}
