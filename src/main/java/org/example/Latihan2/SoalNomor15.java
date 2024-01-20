package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teks = input.nextLine();
        char huruf1 = Character.toLowerCase(input.next().charAt(0));
        char huruf2 = Character.toLowerCase(input.next().charAt(0));
        char huruf3 = Character.toLowerCase(input.next().charAt(0));
        int jumlahMuncul = 0;
        for (int i = 0; i < teks.length() - 2; i++) {
            char currentChar = Character.toLowerCase(teks.charAt(i));
            char nextChar1 = Character.toLowerCase(teks.charAt(i + 1));
            char nextChar2 = Character.toLowerCase(teks.charAt(i + 2));

            if (currentChar == huruf1 && nextChar1 == huruf2 && nextChar2 == huruf3) {
                jumlahMuncul++;
            }
        }
        System.out.println(jumlahMuncul);
    }
}
