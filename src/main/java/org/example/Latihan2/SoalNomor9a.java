package org.example.Latihan2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SoalNomor9a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca tiga baris elemen-elemen blok Sudoku
        int[][] sudokuBlock = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sudokuBlock[i][j] = scanner.nextInt();
            }
        }

        // Memeriksa validitas blok Sudoku
        String result = isValidSudokuBlock(sudokuBlock);

        // Menampilkan hasil
        System.out.println(result);

        scanner.close();
    }

    // Fungsi untuk memeriksa validitas blok Sudoku
    private static String isValidSudokuBlock(int[][] block) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        // Memeriksa setiap elemen dalam blok
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int currentNumber = block[i][j];

                // Jika angka sudah ada dalam set, blok tidak valid
                if (uniqueNumbers.contains(currentNumber)) {
                    return "tidak valid";
                }

                // Menambahkan angka ke dalam set
                uniqueNumbers.add(currentNumber);
            }
        }

        // Blok valid jika semua angka unik
        return "valid";
    }
}

