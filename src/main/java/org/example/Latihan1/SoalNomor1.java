package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        if (angka >= 0 && angka <= 100) {
            int hasil = angka * 2;
            System.out.println(hasil);
        }
        else {
            System.out.println("Angka tidak valid.");
        }
    }
}
