package org.example.Latihan3;

import java.util.Scanner;

public class SoalNomor8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        if (decimal == 0) {
            System.out.println(0);
        } else {
            StringBuilder hexa = new StringBuilder();
            while (decimal > 0) {
                int remainder = decimal % 16;
                if (remainder < 10) {
                    hexa.insert(0, remainder);
                }
                else {
                    char hexDigit = (char) ('A' + (remainder - 10));
                    hexa.insert(0, hexDigit);
                }
                decimal /= 16;
            }
            System.out.println(hexa.toString());
        }
    }
}
