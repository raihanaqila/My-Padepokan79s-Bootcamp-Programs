package org.example;

import java.util.Scanner;

public class SoalNomor11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Validasi Waktu Pertunjukan Teater");
        System.out.println("Masukkan Jam: ");
        int jamInput = input.nextInt();
        System.out.println("Masukkan Menit: ");
        int menitInput = input.nextInt();
        System.out.println("Masukkan Durasi (dalam menit): ");
        int durasiInput = input.nextInt();
        if (jamInput >= 0 && jamInput < 24 && menitInput >= 0 && menitInput < 60 && durasiInput >= 0 && durasiInput <= 240) {
            System.out.println("Waktu pertunjukan valid.");
        }
        else {
            System.out.println("Pertunjukan melewati tengah malam.");
        }
    }
}
