package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        for (String numStr : numbersAsString) {
            int currentNumber = Integer.parseInt(numStr);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
            if (currentNumber < minNumber) {
                minNumber = currentNumber;
            }
        }
        int selisih = maxNumber - minNumber;
        System.out.println(selisih);
    }
}
