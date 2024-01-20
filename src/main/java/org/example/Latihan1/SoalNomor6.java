package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double l = input.nextDouble();
        double t = input.nextDouble();
        double volume = p * l * t * 1 / 3;
        System.out.println(String.format("%.6f", volume));
    }
}
