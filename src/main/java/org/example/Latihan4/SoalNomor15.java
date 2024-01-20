package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        while (numbers[1] != 0) {
            int temp = numbers[1];
            numbers[1] = numbers[0] % numbers[1];
            numbers[0] = temp;
        }
        System.out.println(numbers[0]);
    }
}
