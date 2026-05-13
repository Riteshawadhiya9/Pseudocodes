package Hemant_Sir.Strings;

import java.util.Scanner;

public class Q1_Print_Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.next();
        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i+1 ; j <= s.length() ; j++) {
                System.out.print(s.substring(i, j) + " ");
            }
            System.out.println();
        }

//        for (int i = 0; i < s.length(); i++) {
//
//            for (int j = i + 1; j <= s.length(); j++) {
//
//                System.out.println(s.substring(i, j));
//            }
//            System.out.println();
//        }
    }
}

