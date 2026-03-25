package Pseudocodes.Arrays;

import java.util.Scanner;

public class Q10_Find_Max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}


//START
//
//DECLARE n, max : INTEGER
//
//PRINT "Enter number of elements"
//READ n
//
//IF n ≤ 0 THEN
//  PRINT "Invalid array size"
//END IF
//
//DECLARE arr[n] : INTEGER
//
//PRINT "Enter n elements"
//FOR i ← 0 TO n-1
//  READ arr[i]
//END FOR
//
//SET max ← arr[0]
//
//FOR i ← 1 TO n-1 DO
//IF arr[i] > max THEN
//     max ← arr[i]
//END IF
//END FOR
//
//PRINT "Maximum element =", max
//
//END