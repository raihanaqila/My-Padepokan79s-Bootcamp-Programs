package org.example.Latihan4;

import java.util.*;

public class SoalNomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double minPersenSama = input.nextDouble();
        input.nextLine();
        String[] kueK = input.nextLine().split(" ");
        String[] kueL = input.nextLine().split(" ");
        int komposisiSama = 0;
        int totalKomposisi = Math.max(kueK.length, kueL.length);
        for (String bahanK : kueK) {
            for (String bahanL : kueL) {
                if (bahanK.equals(bahanL)) {
                    komposisiSama++;
                    break;
                }
            }
        }
        double persenSama = (double) komposisiSama / totalKomposisi * 100;
        if (persenSama >= minPersenSama) {
            System.out.println("sama");
        }
        else {
            System.out.println("tidak sama");
        }
    }
}
