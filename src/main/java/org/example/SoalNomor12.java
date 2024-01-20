package org.example;

import java.util.Scanner;

public class SoalNomor12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Greetings Time Traveler!");
        System.out.println("To when would you like to travel?");
        System.out.println("Masukkan Tahun: ");
        int tahun = input.nextInt();
        System.out.println("Masukkan Bulan: ");
        int bulan = input.nextInt();
        System.out.println("Masukkan Tanggal: ");
        int tanggal = input.nextInt();
        if (tahun >= 1000 && tahun < 10000 && bulan >= 1 && bulan <= 12 && tanggal > 0 && tanggal <= 31) {
            switch (bulan) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("Tanggal valid.");
                    break;
                case 4, 6, 9, 11:
                    if (tanggal != 31) {
                        System.out.println("Tanggal valid.");
                    } else {
                        System.out.println("Tanggal tidak valid.");
                    }
                    break;
                case 2:
                    if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                        if (tanggal != 30 && tanggal != 31) {
                            System.out.println("Tanggal valid.");
                        } else {
                            System.out.println("Tanggal tidak valid.");
                        }
                        break;
                    } else {
                        if (tanggal != 29 && tanggal != 30 && tanggal != 31) {
                            System.out.println("Tanggal valid.");
                        } else {
                            System.out.println("Tanggal tidak valid.");
                        }
                        break;
                    }
                default:
                    break;
            }
        } else {
            System.out.println("Tanggal tidak valid.");
        }
    }
}
