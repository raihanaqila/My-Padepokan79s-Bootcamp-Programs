package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        String[] kata = kalimat.split("\\s+");
        StringBuilder kalimatPalindrom = new StringBuilder();
        for (String kataSatu : kata) {
            if (isPalindrom(kataSatu)) {
                kalimatPalindrom.append(kataSatu).append(" ");;
            }
        }
        System.out.println(kalimatPalindrom.toString().trim());
    }
    private static boolean isPalindrom(String kata) {
        int panjang = kata.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kata.charAt(i) != kata.charAt(panjang - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
