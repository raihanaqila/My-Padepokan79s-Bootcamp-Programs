package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        perpangkatan(numbers[0], numbers[1]);
    }
    public static void perpangkatan(int a, int b) {
        int hasil = a;
        for (int i = 1; i < b; i++) {
            hasil *= a;
        }
        System.out.println(hasil);
    }
}
