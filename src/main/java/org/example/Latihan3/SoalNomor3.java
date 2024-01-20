package org.example.Latihan3;

import java.util.Scanner;

public class SoalNomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int baru = 1;
        for (int i = 1; i <= n; i++) {
            baru = 1;
            for (int j = 1; j <= i; j++) {
                if (i == 1 && j == 1) {
                    String hasil = baru / (int) Math.pow(2, j-1) + " ";
                    System.out.print(hasil);
                }
                else if (i != 1 && j == 1) {
                    baru = (int) Math.pow(2, i-1);
                    String hasil = baru / (int) Math.pow(2, j-1) + " ";
                    System.out.print(hasil);
                }
                else if (i != 1 && j != 1) {
                    String hasil = baru / (int) Math.pow(2, j - 1) + " ";
                    System.out.print(hasil);
                }
            }
            System.out.println();
        }
    }
}
