package Hemant_Sir.Strings;

import java.util.Scanner;

public class Q2_String_rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char [] ch = str.toCharArray();

        int i = 0;
        int j = ch.length-1;

        while(i <= j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        String rev = new String(ch);
        System.out.println("Reversed -> : "+rev);
    }
}
