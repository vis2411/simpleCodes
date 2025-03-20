package com.java.practise;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("the spiral order matrix is : ");
        int sRow = 0;
        int sCol = 0;
        int eRow = m - 1;
        int eCol = n - 1;


        while (sRow<=eRow && sCol<=eCol) {
            for (int j = sRow; j <=eCol; j++) {
                System.out.println(matrix[sRow][j]);
            }

            for (int i = sRow+1; i <= eRow; i++) {
                System.out.println(matrix[i][eCol]);
            }

            for (int j = eCol - 1; j >=sCol;j--){
                if(sRow==eRow){
                    break;
                }
                System.out.println(matrix[eRow][j]);
            }

            for (int i = eRow-1 ; i>=sRow+1;i--){
                if(sCol==eCol){break;}
                System.out.println(matrix[eRow][i]);
            }

            sRow++;
            eRow--;
            sCol++;
            eCol--;


        }
    }
}
