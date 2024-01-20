package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        perkalian(numbers[0], numbers[1]);
    }
    public static void perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println(hasil);
    }
}
