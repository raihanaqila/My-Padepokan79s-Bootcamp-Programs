package org.example.Latihan2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SoalNomor10 {
    public static void main(String[] args) {
        int i, j;
        Scanner input = new Scanner(System.in);
        char[][] arr = new char[3][3];
        Set<Character> uniqueAlphabet = new HashSet<>();
        boolean isValid = false;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = input.next().charAt(0);
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                char currentAlphabet = arr[i][j];
                switch (currentAlphabet) {
                    case 'a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O':
                        if (uniqueAlphabet.contains(currentAlphabet)) {
                            isValid = false;
                        }
                        else {
                            isValid = true;
                            uniqueAlphabet.add(currentAlphabet);
                            System.out.println(currentAlphabet + ": (" + (i + 1) + "," + (j + 1) + ")");
                        }
                        break;
                }
            }
        }
        if (!isValid) {
            System.out.println("tidak ada huruf vokal");
        }
    }
}
