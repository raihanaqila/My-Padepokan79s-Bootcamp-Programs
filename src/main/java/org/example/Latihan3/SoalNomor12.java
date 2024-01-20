package org.example.Latihan3;

import java.util.Scanner;

public class SoalNomor12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();
        int counter = 0;
        for (int i = X+1; i < Y; i++) {
            if (i % 10 != 4) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
