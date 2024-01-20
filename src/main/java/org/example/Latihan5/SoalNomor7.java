package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        System.out.println(faktorial(numbers[0]));
    }
    public static int faktorial(int a) {
        int hasil = 1;
        while (a != 0) {
            hasil *= a;
            a--;
        }
        return hasil;
    }
}
