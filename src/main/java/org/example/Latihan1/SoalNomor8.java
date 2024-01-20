package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double l = input.nextDouble();
        double phi = 3.14;
        double r2 = l / phi;
        double r = Math.sqrt(r2);
        System.out.println(String.format("%.2f", r));
    }
}
