package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor8 {
    public static void main(String[] args) {
        int i, j;
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        if (arr[0][0] != 0 && arr[1][1] != 0 && arr[2][2] != 0) {
            if (arr[0][1] == 0 && arr[0][2] == 0 && arr[1][0] == 0 && arr[1][2] == 0 && arr[2][0] == 0 && arr[2][1] == 0) {
                System.out.println("matriks diagonal");
            }
            else {
                System.out.println("bukan matriks diagonal");
            }
        }
        else {
            System.out.println("bukan matriks diagonal");
        }
    }
}
