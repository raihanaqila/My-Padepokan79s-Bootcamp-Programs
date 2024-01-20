package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1 = input.nextInt();
        int r2 = input.nextInt();
        int r3 = input.nextInt();
        double r = input.nextDouble();
        double pi = 3.140000026;
        double sr1 = r * r1/r1;
        double sr2 = r * r2/r1;
        double sr3 = r * r3/r1;
        double volume1 = pi * sr1 * sr1 * sr1 * 4 / 3;
        double volume2 = pi * sr2 * sr2 * sr2 * 4 / 3;
        double volume3 = pi * sr3 * sr3 * sr3 * 4 / 3;
        double hasil = volume1 + volume2 + volume3;
        System.out.println(String.format("%.2f", hasil));
    }
}
