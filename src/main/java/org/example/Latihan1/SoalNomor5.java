package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double t = input.nextDouble();
        double phi = 3.14;
        double volume = phi*r*r*t;
        System.out.println(String.format("%.2f", volume));
    }
}
