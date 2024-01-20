package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor11 {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        StringBuilder hasilAlay = new StringBuilder();
        for (i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            switch (karakter) {
                case 'A', 'a':
                    hasilAlay.append('4');
                    break;
                case 'I', 'i':
                    hasilAlay.append('1');
                    break;
                case 'Z', 'z':
                    hasilAlay.append('2');
                    break;
                case 'E', 'e':
                    hasilAlay.append('3');
                    break;
                case 'G', 'g':
                    hasilAlay.append('6');
                    break;
                case 'J', 'j':
                    hasilAlay.append('7');
                    break;
                case 'B', 'b':
                    hasilAlay.append('8');
                    break;
                default:
                    hasilAlay.append(karakter);
                    break;
            }
        }
        System.out.println(hasilAlay);
    }
}
