package org.example;

import java.util.Scanner;

public class SoalNomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Awal Roti Keju: ");
        int rotiKejuAwal = input.nextInt();
        System.out.println("Masukkan Jumlah Awal Roti Coklat: ");
        int rotiCoklatAwal = input.nextInt();
        System.out.println("Masukkan Jumlah Roti Keju Yang Terjual: ");
        int rotiKejuTerjual = input.nextInt();
        System.out.println("Masukkan Jumlah Roti Coklat Yang Terjual: ");
        int rotiCoklatTerjual = input.nextInt();
        if (rotiKejuAwal >= 0 && rotiCoklatAwal >= 0 && rotiKejuTerjual >=0 && rotiCoklatTerjual >= 0) {
            if (rotiKejuTerjual > rotiCoklatTerjual) {
                int naikProduksiKeju = rotiKejuAwal*2;
                int turunProduksiCoklat = rotiCoklatAwal/2;
                System.out.println("Roti Keju akan diproduksi sebanyak " + naikProduksiKeju);
                System.out.println("Roti Coklat akan diproduksi sebanyak " + turunProduksiCoklat);
            }
            else {
                int naikProduksiCoklat = rotiCoklatAwal*2;
                int turunProduksiKeju = rotiKejuAwal/2;
                System.out.println("Roti Coklat akan diproduksi sebanyak " + naikProduksiCoklat);
                System.out.println("Roti Keju akan diproduksi sebanyak " + turunProduksiKeju);
            }
        }
        else {
            System.out.println("Data Roti tidak valid");
        }
    }
}
