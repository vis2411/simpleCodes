package dsa;

import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {
        //memory taken by any matrix formula = (rom * column) * datatypeSize
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();


        int[][] numbers = new int[row][column];
        //input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                numbers[i][j] = sc.nextInt();
//                System.out.println(numbers[i][j]);
            }
        }

        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
//                System.out.print(numbers[i][j] + " ");
                if (numbers[i][j]==x){
                    System.out.println("x found at : " + i + " " +j);
                }
            }
            System.out.println();
        }
    }
}