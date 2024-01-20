package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] k1 = input.next().toCharArray();
        char[] k2 = input.next().toCharArray();
        int panjangK1 = k1.length;
        int panjangK2 = k2.length;
        int hasilPerbandingan = 0;
        int posisiPerbedaan = 0;
        int panjangMinimum = Math.min(panjangK1, panjangK2);
        for (int i = 0; i < panjangMinimum; i++) {
            if (k1[i] != k2[i]) {
                hasilPerbandingan = k1[i] - k2[i];
                posisiPerbedaan = i + 1;
                break;
            }
        }
        if (hasilPerbandingan == 0 && panjangK1 != panjangK2) {
            posisiPerbedaan = Math.min(panjangK1, panjangK2) + 1;
            if (panjangK1 > panjangK2) {
                hasilPerbandingan = k1[posisiPerbedaan - 1] - '\0';
            } else {
                hasilPerbandingan = '\0' - k2[posisiPerbedaan - 1] - 1;
            }
        }
        if (hasilPerbandingan == 0) {
            for (int i = panjangMinimum; i < Math.max(panjangK1, panjangK2); i++) {
                hasilPerbandingan = k1[i] - k2[i];
                posisiPerbedaan = i + 1;
                if (hasilPerbandingan != 0) {
                    break;
                }
            }
        }
        if (hasilPerbandingan == 0) {
            System.out.println("0");
            System.out.println("0");
        } else {
            System.out.println((hasilPerbandingan > 0 ? "+" : "") + hasilPerbandingan);
            System.out.println(posisiPerbedaan);
        }
    }
}
