package org.example.Latihan3;

import java.util.Scanner;

public class SoalNomor15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[15];
        int n = input.nextInt();
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 1) {
                arr[i - 1] = n;
                n += 3;
            } else if (i % 3 == 2) {
                arr[i - 1] = n;
                n += 4;
            } else if (i % 3 == 0) {
                arr[i - 1] = n;
                n += 5;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
