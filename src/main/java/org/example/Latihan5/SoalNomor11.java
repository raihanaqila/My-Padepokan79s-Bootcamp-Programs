package org.example.Latihan5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SoalNomor11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(rerata(numbers, N)));
    }
    public static float rerata(int data[], int N) {
        int totalNilai = 0;
        for (int i = 0; i < N; i++) {
            totalNilai += data[i];
        }
        float rataRata = (float) totalNilai / N;
        return rataRata;
    }
}
