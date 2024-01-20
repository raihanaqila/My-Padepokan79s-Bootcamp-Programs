package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String romawi = input.nextLine().toUpperCase();
        int[] nilai = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int desimal = 0;
        for (int i = 0; i < simbol.length; i++) {
            while (romawi.startsWith(simbol[i])) {
                desimal += nilai[i];
                romawi = romawi.substring(simbol[i].length());
            }
        }
        System.out.println(desimal);
    }
}
