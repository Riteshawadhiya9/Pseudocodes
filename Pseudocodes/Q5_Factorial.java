package Pseudocodes;

import java.util.Scanner;

public class Q5_Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial = " + fact);
        }
    }
}

//START
//
//DECLARE n, fact : INTEGER
//
//PRINT "Enter a number"
//READ n
//
//IF n < 0 THEN
//PRINT "Factorial is not defined for negative numbers"
//ELSE
//SET fact ← 1
//
//FOR i ← 1 TO n DO
//fact ← fact × i
//END FOR
//
//PRINT "Factorial =", fact
//END IF
//
//END