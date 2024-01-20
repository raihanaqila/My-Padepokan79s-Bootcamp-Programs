package org.example.Latihan3;

import java.util.Scanner;

public class SoalNomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        if (decimal == 0) {
            System.out.println(0);
        } else {
            StringBuilder binary = new StringBuilder();
            while (decimal > 0) {
                int remainder = decimal % 2;
                binary.insert(0, remainder);
                decimal /= 2;
            }
            System.out.println(binary.toString());
        }
    }
}
