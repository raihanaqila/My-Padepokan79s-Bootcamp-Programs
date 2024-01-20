package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor12 {
    public static void main(String[] args) {
        int i;
        int l1 = 0;
        int l2 = 0;
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        for (i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            switch (karakter) {
                case 'A', 'D', 'O', 'P', 'Q', 'R':
                    l1 += 1;
                    break;
                case 'B':
                    l2 += 2;
                    break;
            }
        }
        System.out.println(l1+l2);
    }
}
