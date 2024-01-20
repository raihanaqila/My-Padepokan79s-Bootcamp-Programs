package org.example;

import java.util.Scanner;

public class SoalNomor8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Mesin Konversi Detik!");
        System.out.println("Masukkan Jumlah detik: ");
        int detikInput = input.nextInt();
        if (detikInput >= 0) {
            int jam, menit, detik;
            jam = (detikInput%86400)/3600;
            menit = ((detikInput%86400)%3600)/60;
            detik = ((detikInput%86400)%3600)%60;
            System.out.println("Hasil konversi: " + jam + " jam, " + menit + " menit, " + detik + " detik");
        }
        else {
            System.out.println("Jumlah detik tidak valid");
        }
    }
}
