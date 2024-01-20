package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        int hasil = penjumlahan(numbers[0], numbers[1], numbers[2]);
        System.out.println(hasil);
    }
    public static int penjumlahan(int a, int b, int c) {
        int n = a + b + c;
        return n;
    }
}
