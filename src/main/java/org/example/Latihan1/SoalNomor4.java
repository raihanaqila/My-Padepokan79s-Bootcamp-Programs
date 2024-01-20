package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        int n = input.nextInt();
        double phi = 3.14;
        double luas = phi*r*r;
        double hasil = n * luas;
        System.out.println(String.format("%.2f", hasil));
    }
}
