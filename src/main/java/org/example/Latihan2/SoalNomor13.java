package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        boolean isValid = true;
        for (int i = 2; i <= Math.sqrt(X); i++) {
            if (X < 1 || X % X != 0 || X % i == 0) {
                isValid = false;
            }
        }
        if (isValid) {
            System.out.println("prima");
        }
        else {
            System.out.println("bukan prima");
        }
    }
}
