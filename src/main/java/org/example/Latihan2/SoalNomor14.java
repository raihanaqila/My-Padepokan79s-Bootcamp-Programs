package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor14 {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int nilaiTerbesar = 0;
        for (i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
            if (arr[i] > nilaiTerbesar) {
                nilaiTerbesar = arr[i];
            }
        }
        System.out.println(nilaiTerbesar);
    }
}
