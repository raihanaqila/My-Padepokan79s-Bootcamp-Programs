package org.example;

import java.util.Scanner;

public class SoalNomor10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Biaya Parkir");
        System.out.println("Masukkan Angka Jenis Kendaraan Anda");
        System.out.println("(1 = Mobil, 2 = Motor, 3 = Sepeda): ");
        int jKendaraan = input.nextInt();
        System.out.println("Masukkan Durasi Parkir (dalam jam): ");
        int lParkir = input.nextInt();
        int tParkir;
        switch (jKendaraan) {
            case 1:
                tParkir = 5000 * lParkir;
                System.out.println("Biaya parkir adalah Rp " + tParkir + ".");
                break;
            case 2:
                tParkir = 2000 * lParkir;
                System.out.println("Biaya parkir adalah Rp " + tParkir + ".");
                break;
            case 3:
                tParkir = 1000 * lParkir;
                System.out.println("Biaya parkir adalah Rp " + tParkir + ".");
                break;
            default:
                System.out.println("Jenis kendaraan tidak valid.");
        }
    }
}
