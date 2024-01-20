package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        int minPrime = Integer.MAX_VALUE;
        int maxPrime = Integer.MIN_VALUE;
        for (int i = X; i <= Y; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                minPrime = Math.min(minPrime, i);
                maxPrime = Math.max(maxPrime, i);
            }
        }
        int result = maxPrime - minPrime;
        System.out.println(result);
    }
}
