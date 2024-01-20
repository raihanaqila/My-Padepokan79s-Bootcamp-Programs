package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor10a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca array 2 dimensi
        char[][] array2D = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] = scanner.next().charAt(0);
            }
        }

        // Menampilkan posisi kemunculan huruf vokal
        displayVowelPositions(array2D);

        scanner.close();
    }

    // Fungsi untuk menampilkan posisi kemunculan huruf vokal
    private static void displayVowelPositions(char[][] array) {
        boolean foundVowel = false;

        // Melakukan iterasi pada array 2 dimensi
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char currentChar = array[i][j];

                // Memeriksa apakah huruf merupakan huruf vokal
                if (isVowel(currentChar)) {
                    foundVowel = true;
                    System.out.println(currentChar + ": (" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }

        // Jika tidak ada huruf vokal
        if (!foundVowel) {
            System.out.println("tidak ada huruf vokal");
        }
    }

    // Fungsi untuk memeriksa apakah sebuah karakter merupakan huruf vokal
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}

