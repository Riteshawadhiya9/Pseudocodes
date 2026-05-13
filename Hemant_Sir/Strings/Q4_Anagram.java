package Hemant_Sir.Strings;

import java.util.Arrays;

public class Q4_Anagram {
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = "racarce";

        if(s1.length() != s2.length()){
            System.out.println("Not a valid Anagram...");
        }

        char []c1 = s1.toCharArray();
        char []c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean flag = false;

        for(int i = 0 ; i < c1.length ; i++) {
            if (c1[i] != c2[i]) {
                flag = true;
            }
        }

        if(!flag){
            System.out.println("Valid Anagram");
        }else {
            System.out.println("Not Valid");
        }
    }
}
