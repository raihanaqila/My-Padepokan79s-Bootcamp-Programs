package org.example;

import java.util.Scanner;

public class SoalNomor9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mencari Bilangan Terbesar dan Terkecil");
        System.out.println("Masukkan Bilangan Pertama: ");
        int A = input.nextInt();
        System.out.println("Masukkan Bilangan Kedua: ");
        int B = input.nextInt();
        System.out.println("Masukkan Bilangan Ketiga: ");
        int C = input.nextInt();
        System.out.println("Masukkan Bilangan Terakhir: ");
        int D = input.nextInt();
        int max = A;
        int min = A;
        if (B > max) {
            max = B;
        } else if (B < min) {
            min = B;
        }
        if (C > max) {
            max = C;
        } else if (C < min) {
            min = C;
        }
        if (D > max) {
            max = D;
        } else if (D < min) {
            min = D;
        }
        System.out.println("Bilangan terbesar: " + max);
        System.out.println("Bilangan terkecil: " + min);
    }
}
