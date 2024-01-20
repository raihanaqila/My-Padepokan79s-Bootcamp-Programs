package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arrayX = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayX[i][j] = input.nextInt();
            }
        }
        int jGanjil = hitungGanjil(arrayX);
        System.out.println(jGanjil);
        input.close();
    }
    private static int hitungGanjil(int[][] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    counter++;
                }
            }
        }
        return counter;
    }
}

