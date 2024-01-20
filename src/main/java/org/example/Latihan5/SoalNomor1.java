package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        int pembilang = numbers[0] * numbers[1];
        while (numbers[1] != 0) {
            int temp = numbers[1];
            numbers[1] = numbers[0] % numbers[1];
            numbers[0] = temp;
        }
        int hasil = pembilang / numbers[0];
        System.out.println(hasil);
    }
}
