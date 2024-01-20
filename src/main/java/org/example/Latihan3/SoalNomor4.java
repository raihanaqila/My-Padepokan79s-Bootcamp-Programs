package org.example.Latihan3;

import java.util.Scanner;

public class SoalNomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int baru = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(baru + " ");
                baru += 1;
            }
            System.out.println();
        }
    }
}
