package org.example.Latihan4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SoalNomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> uniqueNumbers = new HashSet<>();
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        for (String numStr : numbersAsString) {
            int currentNumber = Integer.parseInt(numStr);
            if (isPrime(currentNumber)) {
                uniqueNumbers.add(currentNumber);
            }
        }
        System.out.println(uniqueNumbers.size());
    }
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
