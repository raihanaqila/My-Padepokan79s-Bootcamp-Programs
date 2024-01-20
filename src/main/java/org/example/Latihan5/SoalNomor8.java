package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        int M = numbers[0];
        int N = numbers[1];
        System.out.println(hitungCara(M, N));
    }
    public static int hitungCara(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        int hasil = 1;
        for (int i = 0; i < a; i++) {
            hasil *= (b - i);
        }
        return hasil;
    }
}
