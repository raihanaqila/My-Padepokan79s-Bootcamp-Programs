package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor2a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arrayX = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayX[i][j] = input.nextInt();
            }
        }
        int counter = 0;
        for (int k = 0; k < arrayX.length; k++) {
            for (int l = 0; l < arrayX[k].length; l++) {
                if (arrayX[k][l] % 2 != 0) {
                    counter++;
                }
            }
        }
        int jGanjil = counter;
        System.out.println(jGanjil);
    }
}
