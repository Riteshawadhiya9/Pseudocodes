package Pseudocodes;

import java.util.Scanner;

public class Q7_Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = sc.nextInt();

        int number = originalNumber;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }

        // Check palindrome
        if (originalNumber == reversedNumber) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}


//START
//
//DECLARE originalNumber, number, reversedNumber, digit : INTEGER
//
//PRINT "Enter a number"
//READ originalNumber
//
//SET number ← originalNumber
//SET reversedNumber ← 0
//
//WHILE number ≠ 0 DO
    //digit ← number MOD 10
    //reversedNumber ← reversedNumber × 10 + digit
    //number ← number DIV 10
//END WHILE
//
//IF originalNumber = reversedNumber THEN
//      PRINT "Palindrome"
//ELSE
//      PRINT "Not a Palindrome"
//END IF
//
//END