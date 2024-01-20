package org.example.Latihan3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class SoalNomor14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        HashSet<String> juaraCatur = new HashSet<>();
        for (int i = 0; i < N; i++) {
            String namaCatur = input.nextLine();
            juaraCatur.add(namaCatur);
        }
        int M = input.nextInt();
        input.nextLine();
        HashSet<String> juaraBadminton = new HashSet<>();
        for (int i = 0; i < M; i++) {
            String namaBadminton = input.nextLine();
            juaraBadminton.add(namaBadminton);
        }
        HashSet<String> juaraKeduaCabang = new HashSet<>(juaraCatur);
        juaraKeduaCabang.retainAll(juaraBadminton);
        ArrayList<String> hasilAkhir = new ArrayList<>(juaraKeduaCabang);
        Collections.sort(hasilAkhir, Collections.reverseOrder());
        if (hasilAkhir.isEmpty()) {
            System.out.println("tidak ada sang juara");
        } else {
            for (String nama : hasilAkhir) {
                System.out.println(nama);
            }
        }
    }
}
