package org.example.Latihan3;

import java.util.Scanner;

public class SoalNomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String biner = input.nextLine();
        int decimal = 0;
        int length = biner.length();
        for (int i = 0; i < length; i++) {
            char digitChar = biner.charAt(i);
            if (digitChar != '0' && digitChar != '1') {
                System.exit(1);
            }
            int digit = Character.getNumericValue(digitChar);
            decimal += digit * Math.pow(2, length - i - 1);
        }
        System.out.println(decimal);
    }
}
