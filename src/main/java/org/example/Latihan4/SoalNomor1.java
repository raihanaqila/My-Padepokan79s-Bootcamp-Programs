package org.example.Latihan4;

import java.util.Scanner;

public class SoalNomor1 {
    public static void main(String[] args) {
        String huruf, hasil = "";
        Scanner input = new Scanner(System.in);
        huruf = input.nextLine();
        int jAmbil = input.nextInt();
        if (jAmbil <= 0 || jAmbil > huruf.length()) {
            System.out.println("Nilai N tidak valid. Harap masukkan nilai yang sesuai.");
            return;
        }
        int jHuruf = huruf.length();
        int jBaru = jHuruf - jAmbil;
        int jCounter = jAmbil;

        for (int i = 0; i < jCounter; i++) {
            hasil += huruf.charAt(jBaru);
            jBaru++;
        }
        System.out.println(hasil);
    }
}
