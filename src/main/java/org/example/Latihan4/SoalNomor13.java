package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double minPersenSama = input.nextDouble();
        input.nextLine();
        int jumlahK = input.nextInt();
        input.nextLine();
        String[] kueK = new String[jumlahK];
        for (int i = 0; i < jumlahK; i++) {
            kueK[i] = input.nextLine();
        }
        int jumlahL = input.nextInt();
        input.nextLine();
        String[] kueL = new String[jumlahL];
        for (int i = 0; i < jumlahL; i++) {
            kueL[i] = input.nextLine();
        }
        int komposisiSama = 0;
        int totalKomposisi = Math.max(jumlahK, jumlahL);
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
