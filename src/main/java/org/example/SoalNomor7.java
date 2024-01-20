package org.example;

import java.util.Scanner;

public class SoalNomor7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Pendapatan Tahunan (dalam Rp): ");
        int pendapatan = input.nextInt();
        int pajak;
        if (pendapatan <= 5000000) {
            pajak = pendapatan / 100 * 5;
            System.out.println("Pajak yang perlu dibayar sebesar " + pajak);
        }
        else if (pendapatan > 5000000 && pendapatan <= 20000000) {
            pajak = pendapatan / 100 * 10;
            System.out.println("Pajak yang perlu dibayar sebesar " + pajak);
        }
        else if (pendapatan > 20000000 && pendapatan <= 50000000) {
            pajak = pendapatan / 100 * 15;
            System.out.println("Pajak yang perlu dibayar sebesar " + pajak);
        }
        else if (pendapatan > 50000000) {
            pajak = pendapatan / 100 * 20;
            System.out.println("Pajak yang perlu dibayar sebesar " + pajak);
        }
        else {
            System.out.println("Jumlah pendapatan tidak valid.");
        }
    }
}
