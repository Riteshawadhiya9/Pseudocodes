package Pseudocodes;

import java.util.Scanner;

public class Q3_If_else_if_lader {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        int cn = sc.nextInt();
        int dbms = sc.nextInt();
        int ds = sc.nextInt();
        int oops = sc.nextInt();
        int ml = sc.nextInt();

        int percentage = (cn + dbms + ds + oops + ml) / 5;

        System.out.println("Percentage: " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }
}


//START
//
//        DECLARE cn, dbms, ds, oops, ml, percentage : INTEGER
//
//PRINT "Enter marks for 5 subjects"
//        READ cn, dbms, ds, oops, ml
//
//SET percentage ← (cn + dbms + ds + oops + ml) / 5
//
//PRINT "Percentage =", percentage
//
//IF percentage >= 90 THEN
//PRINT "Grade: A+"
//ELSE IF percentage >= 80 THEN
//PRINT "Grade: A"
//ELSE IF percentage >= 70 THEN
//PRINT "Grade: B"
//ELSE IF percentage >= 60 THEN
//PRINT "Grade: C"
//ELSE IF percentage >= 50 THEN
//PRINT "Grade: D"
//ELSE
//PRINT "Grade: F"
//END IF
//
//END