package Pseudocodes.Multi_Dimention_Array;

import java.util.Scanner;

public class Q11_Sum_of_Value {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        if (r <= 0 || c <= 0) {
            System.out.println("Invalid matrix size");
            return;
        }

        int[][] mat = new int[r][c];
        int sum = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
                sum += mat[i][j];   // Optimized: sum during input
            }
        }

        System.out.println("Sum of all elements: " + sum);
    }
}


//START
//
//DECLARE r, c, sum : INTEGER
//
//PRINT "Enter number of rows"
//READ r
//
//PRINT "Enter number of columns"
//READ c
//
//IF r ≤ 0 OR c ≤ 0 THEN
    //PRINT "Invalid matrix size"
//END IF
//
//DECLARE mat[r][c] : INTEGER
//SET sum ← 0
//
//PRINT "Enter matrix elements"
//
//FOR i ← 0 TO r-1 DO
//FOR j ← 0 TO c-1 DO
//READ mat[i][j]
//sum ← sum + mat[i][j]
//END FOR
//END FOR
//
//PRINT "Sum of all elements =", sum
//
//END