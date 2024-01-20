package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1 = input.nextInt();
        int r2 = input.nextInt();
        int r3 = input.nextInt();
        double s = input.nextDouble();
        double s1 = s * r1/r1;
        double s2 = s * r2/r1;
        double s3 = s * r3/r1;
        double luas1 = s1 * s1;
        double luas2 = s2 * s2;
        double luas3 = s3 * s3;
        double hasil = luas1 + luas2 + luas3;
        System.out.println(String.format("%.2f", hasil));
    }
}