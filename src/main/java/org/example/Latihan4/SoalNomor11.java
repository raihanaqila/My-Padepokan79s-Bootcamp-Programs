package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int B = input.nextInt();
        int K = input.nextInt();
        int[][] matrix = new int[B][K];
        int counter = 1;
        for (int j = 0; j < K; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < B; i++) {
                    matrix[i][j] = counter++;
                }
            }
            else {
                for (int i = B - 1; i >= 0; i--) {
                    matrix[i][j] = counter++;
                }
            }
        }
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < K; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
