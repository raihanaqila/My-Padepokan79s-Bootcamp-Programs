package org.example.Latihan3;

import java.util.Scanner;

public class SoalNomor10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        if (decimal == 0) {
            System.out.println(0);
        } else {
            StringBuilder octal = new StringBuilder();
            while (decimal > 0) {
                int remainder = decimal % 8;
                if (remainder < 8) {
                    octal.insert(0, remainder);
                }
                else {
                    int hexDigit = (int) (9 + (remainder - 8));
                    octal.insert(0, hexDigit);
                }
                decimal /= 8;
            }
            System.out.println(octal.toString());
        }
    }
}
