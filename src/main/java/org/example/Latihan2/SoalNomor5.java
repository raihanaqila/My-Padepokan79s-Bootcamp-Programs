package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor5 {
    public static void main(String[] args) {
        char[] X = {'J', 'T', 'K', 'P', 'o', 'l', 'b', 'a', 'n'};
        Scanner input = new Scanner(System.in);
        String inputS = input.nextLine();
        char huruf1 = inputS.charAt(0);
        char huruf2 = inputS.charAt(2);
        boolean found = false;
        for (int i = 0; i < X.length - 1; i++) {
            if (Character.toLowerCase(X[i]) == Character.toLowerCase(huruf2) && Character.toLowerCase(X[i + 1]) == Character.toLowerCase(huruf1)) {
                found = true;
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
