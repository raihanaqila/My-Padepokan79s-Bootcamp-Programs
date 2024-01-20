package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor15a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input teks
        System.out.println("Masukkan teks (maksimal 40 huruf):");
        String teks = scanner.nextLine();

        // Membaca huruf utama
        System.out.println("Masukkan huruf utama:");
        char hurufUtama = scanner.next().charAt(0);

        // Membaca huruf yang mengikuti huruf utama
        System.out.println("Masukkan dua huruf yang mengikuti huruf utama:");
        char hurufKedua = scanner.next().charAt(0);
        char hurufKetiga = scanner.next().charAt(0);

        // Menghitung jumlah kemunculan tiga huruf berpasangan
        int jumlahKemunculan = hitungKemunculan(teks, hurufUtama, hurufKedua, hurufKetiga);

        // Menampilkan hasil
        System.out.println("Jumlah kemunculan: " + jumlahKemunculan);

        scanner.close();
    }

    // Fungsi untuk menghitung jumlah kemunculan tiga huruf berpasangan
    private static int hitungKemunculan(String teks, char hurufUtama, char hurufKedua, char hurufKetiga) {
        int jumlahKemunculan = 0;

        for (int i = 0; i < teks.length() - 2; i++) {
            char currentChar = Character.toLowerCase(teks.charAt(i));
            char nextChar1 = Character.toLowerCase(teks.charAt(i + 1));
            char nextChar2 = Character.toLowerCase(teks.charAt(i + 2));

            if (currentChar == hurufUtama && nextChar1 == hurufKedua && nextChar2 == hurufKetiga) {
                jumlahKemunculan++;
            }
        }

        return jumlahKemunculan;
    }
}

