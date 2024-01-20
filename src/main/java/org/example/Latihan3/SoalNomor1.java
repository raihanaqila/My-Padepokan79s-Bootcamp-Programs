package org.example.Latihan3;

import java.util.Scanner;

public class SoalNomor1 {
    public static void main(String[] args) {
        String huruf, hasil = "";
        Scanner input = new Scanner(System.in);
        huruf = input.nextLine();
        int jumlah = huruf.length();
        int jHuruf = jumlah - 1;
        for (int i = 0; i < jumlah; i++) {
            hasil += huruf.charAt(jHuruf);
            jHuruf--;
        }
        System.out.println(hasil);
    }
}
