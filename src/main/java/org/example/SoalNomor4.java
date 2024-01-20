package org.example;

import java.util.Scanner;

public class SoalNomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Data Usia: ");
        int usia = input.nextInt();
        if (usia >= 17) {
            System.out.println("Anda memenuhi syarat untuk mengajukan SIM.");
        }
        else if (usia < 17 && usia >= 0) {
            System.out.println("Maaf, Anda belum memenuhi syarat untuk mengajukan SIM.");
        }
        else if (usia < 0) {
            System.out.println("Usia tidak valid.");
        }
    }
}
