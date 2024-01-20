package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        int indeksTengah = numbersAsString.length / 2;
        if (numbersAsString.length <= n) {
            if (numbersAsString.length % 2 != 0) {
                double nilaiTengah = numbers[indeksTengah];
                System.out.println(nilaiTengah);
            }
            else {
                int nilaiTengah1 = numbers[indeksTengah];
                int nilaiTengah2 = numbers[indeksTengah - 1];
                double median = (nilaiTengah1 + nilaiTengah2) / 2.0;
                System.out.println(median);
            }
        }
    }
}
