package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int[][] matrixA = new int[A][B];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }
        int C = input.nextInt();
        int D = input.nextInt();
        int[][] matrixB = new int[C][D];
        for (int i = 0; i < C; i++) {
            for (int j = 0; j < D; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }
        if (B != C) {
            return;
        }
        int[][] resultMatrix = new int[A][D];
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < D; j++) {
                for (int k = 0; k < B; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < D; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
