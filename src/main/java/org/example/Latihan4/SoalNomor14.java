package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        int totalNilai = 0;
        int jelekCounter = 0;
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        for (int i = 0; i < n; i++) {
            totalNilai += numbers[i];
        }
        double rataRata = (double) totalNilai / n;
        for (int i = 0; i < n; i++) {
            if (numbers[i] < rataRata) {
                jelekCounter++;
            }
        }
        System.out.println(jelekCounter);
    }
}
