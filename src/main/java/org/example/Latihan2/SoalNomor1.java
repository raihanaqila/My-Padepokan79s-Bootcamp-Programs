package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor1 {
    public static void main(String[] args) {
        char[] X = {'J', 'T', 'K', 'P', 'o', 'l', 'b', 'a', 'n'};
        Scanner input = new Scanner(System.in);
        char huruf = input.next().charAt(0);
        boolean found = false;
        for (char elemen : X) {
            if (Character.toLowerCase(elemen) == huruf || Character.toUpperCase(elemen) == huruf) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("ada");
        }
        else {
            System.out.println("tidak ada");
        }
    }
}
