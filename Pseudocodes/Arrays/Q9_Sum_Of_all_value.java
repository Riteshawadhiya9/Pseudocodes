package Pseudocodes.Arrays;

import java.util.Scanner;

public class Q9_Sum_Of_all_value {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum of all elements: " + sum);
    }
}



//START
//
//DECLARE n, sum : INTEGER
//PRINT "Enter number of elements"
//READ n
//
//IF n ≤ 0 THEN
//  PRINT "Invalid array size"
//END IF
//
//DECLARE arr[n] : INTEGER
//SET sum ← 0
//
//PRINT "Enter n elements"
//
//FOR i ← 0 TO n-1
//   READ arr[i]
//   sum ← sum + arr[i]
//END FOR
//
//PRINT "Sum of all elements =", sum
//
//END