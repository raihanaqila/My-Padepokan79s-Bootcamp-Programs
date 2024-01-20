package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int desimal = input.nextInt();
        if (desimal <= 0 || desimal > 3999) {
            System.exit(1);
        }
        int[] nilai = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbol = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanNumeral = new StringBuilder();
        int i = 0;
        while (desimal > 0) {
            int count = desimal / nilai[i];
            for (int j = 0; j < count; j++) {
                romanNumeral.append(simbol[i]);
                desimal -= nilai[i];
            }
            i++;
        }
        String romawi = romanNumeral.toString();
        System.out.println(romawi);
    }
}
