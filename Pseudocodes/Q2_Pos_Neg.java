package Pseudocodes;

import java.util.Scanner;

public class Q2_Pos_Neg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n > 0){
            System.out.println(n+" is Positive");
        }else{
            System.out.println(n +" is Negative");
        }

    }
}


//Declare x : Integer
//Read x
//If x is greater than 0 then
//print "Pss"
//        else
//print "Neg"
//end if