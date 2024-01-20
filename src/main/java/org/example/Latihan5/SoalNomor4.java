package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        pertukaran(numbers[0], numbers[1]);
    }
    public static void pertukaran(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}
