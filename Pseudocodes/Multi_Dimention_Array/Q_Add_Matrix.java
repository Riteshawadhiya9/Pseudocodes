package Pseudocodes.Multi_Dimention_Array;

import java.util.Scanner;

public class Q_Add_Matrix {
    public static void printMat(int [][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for(int i = 0 ; i < r ; i++){
            for(int j = 0; j < c ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void AddMat(int[][]arr1 , int r1 , int c1, int[][]arr2 , int r2, int c2){
            if(r1 != r2 || c1 != c2){
                System.out.println("Wrong Dimension!!");
                return;
            }
            int[][] add = new int[r1][c1];
            for(int i =0 ; i < r1 ; i++){
                for(int j = 0 ; j < c1 ; j++){
                    add[i][j] += arr1[i][j] + arr2[i][j];
                }
            }
        System.out.println("Addition of Matrix 1 or Matrix 2");
            printMat(add);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col of Matrix -1");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][]mat1 = new int[r1][c1];
        System.out.println("Enter "+r1*c1+" elem");
        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c1 ; j++){
                mat1[i][j] = sc.nextInt();
            }
        }


        System.out.println("Enter row and col of Matrix -2");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][]mat2 = new int[r2][c2];
        System.out.println("Enter "+r2*c2+" elem");
        for(int i = 0 ; i < r2 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        printMat(mat1);
        System.out.println("Matrix 1");
        printMat(mat2);
        AddMat(mat1,r1,c1,mat2,r2,c2);

    }
}
