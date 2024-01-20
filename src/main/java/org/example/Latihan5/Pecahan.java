package org.example.Latihan5;

import java.util.Scanner;

public class Pecahan {
    public static void main(String[] args) {
        int pemb1, peny1, pemb2, peny2, oper, xpeny;
        int xpemb1, xpemb2, tambah, kurang, kali, bagi1, bagi2;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Pembilang 1 : ");
        pemb1 = input.nextInt();

        System.out.print("Masukkan Penyebut 1 : ");
        peny1 = input.nextInt();

        System.out.print("Masukkan Pembilang 2 : ");
        pemb2 = input.nextInt();

        System.out.print("Masukkan Penyebut 2 : ");
        peny2 = input.nextInt();

        System.out.print("Masukkan Operasi | 1 = + | 2 = - | 3 = x | 4 = / | : ");
        oper = input.nextInt();

        xpeny = peny1 * peny2;
        xpemb1 = (xpeny / peny1) * pemb1;
        xpemb2 = (xpeny / peny2) * pemb2;
        tambah = xpemb1 + xpemb2;
        kurang = xpemb1 - xpemb2;
        kali = pemb1 * pemb2;
        bagi1 = pemb1 * peny2;
        bagi2 = pemb2 * peny1;

        if (oper == 1) {
            // Menyederhanakan pecahan hasil penambahan
            int fpb = cariFPB(tambah, xpeny);
            tambah /= fpb;
            xpeny /= fpb;

            System.out.println(tambah);
            System.out.println("-");
            System.out.println(xpeny);
        } else if (oper == 2) {
            // Menyederhanakan pecahan hasil pengurangan
            int fpb = cariFPB(kurang, xpeny);
            kurang /= fpb;
            xpeny /= fpb;

            System.out.println(kurang);
            System.out.println("-");
            System.out.println(xpeny);
        } else if (oper == 3) {
            // Menyederhanakan pecahan hasil perkalian
            int fpb = cariFPB(kali, peny2);
            kali /= fpb;
            peny2 /= fpb;

            System.out.println(kali);
            System.out.println("-");
            System.out.println(peny2);
        } else if (oper == 4) {
            // Menyederhanakan pecahan hasil pembagian
            int fpb = cariFPB(bagi1, peny2);
            bagi1 /= fpb;
            peny2 /= fpb;

            System.out.println(bagi1);
            System.out.println("-");
            System.out.println(peny2);
        } else {
            System.out.println("INPUT YANG ANDA MASUKKAN SALAH!");
        }
    }

    // Fungsi untuk mencari FPB
    private static int cariFPB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
