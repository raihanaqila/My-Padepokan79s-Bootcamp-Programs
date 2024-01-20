package org.example.Latihan2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SoalNomor9 {
    public static void main(String[] args) {
        int i, j;
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        boolean isValid = true;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                int currentNumber = arr[i][j];
                if (uniqueNumbers.contains(currentNumber)) {
                    isValid = false;
                }
                uniqueNumbers.add(currentNumber);
            }
        }
        if (isValid) {
            System.out.println("valid");
        }
        else {
            System.out.println("tidak valid");
        }
    }
}
