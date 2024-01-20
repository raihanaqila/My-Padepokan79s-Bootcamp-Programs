package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        double bunga = input.nextDouble();
        double hasil = (angka * bunga / 100) + angka;
        System.out.println(String.format("%.2f", hasil));
    }
}
