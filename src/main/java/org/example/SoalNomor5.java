package org.example;

import java.util.Scanner;

public class SoalNomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data Panjang Sisi Kubus: ");
        int panjangSisi = input.nextInt();
        int volumeKubus = panjangSisi*panjangSisi*panjangSisi;
        int luasPermukaanKubus = 6*panjangSisi*panjangSisi;
        if (panjangSisi > 0) {
            System.out.println("Volume kubus: " + volumeKubus);
            System.out.println("Luas permukaan kubus: " + luasPermukaanKubus);
        }
        else {
            System.out.println("Panjang sisi kubus tidak valid");
        }
    }
}
