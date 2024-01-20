package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor3 {
    public static void main(String[] args) {
        int i, j;
        Scanner input = new Scanner(System.in);
        int[][] array1 = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                array1[i][j] = input.nextInt();
            }
        }
        int[][] array2 = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                array2[i][j] = input.nextInt();
            }
        }
        int[][] array3 = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        for (int [] row : array3)
        {
            // traverses through number of rows
            for (int element : row)
            {
                // 'element' has current element of row index
                System.out.print( element  + " ");
            }
            System.out.println();
        }
    }
}
