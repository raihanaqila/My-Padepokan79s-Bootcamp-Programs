package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor1a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char huruf = input.next().charAt(0);
        switch (huruf) {
            case 'J', 'T', 'K', 'P', 'o', 'l', 'b', 'a', 'n', 'j', 't', 'k', 'p', 'O', 'L', 'B', 'A', 'N':
                System.out.println("ada");
                break;
            default:
                System.out.println("tidak ada");
                break;
        }
    }
}
