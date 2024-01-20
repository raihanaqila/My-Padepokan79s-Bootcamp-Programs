package org.example.Latihan1;

import java.util.Scanner;

public class SoalNomor7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String alphabet = input.nextLine();
        switch (alphabet) {
            case "a", "i", "u", "e", "o", "A", "I", "U", "E", "O":
                System.out.println("true");
                break;
            default:
                System.out.println("false");
        }
    }
}
