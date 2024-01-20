package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(String.format("%.2f", fahrenheit));
    }
}
