package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int nomorId[] = new int[N];
        for (int i = 0; i < N; i++) {
            nomorId[i] = input.nextInt();
        }
        System.out.println(mostFrequent(nomorId, N));
    }
    public static int mostFrequent(int[] arr, int n) {
        int maxCount = 0;
        int palingSering = 0;
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (counter > maxCount) {
                maxCount = counter;
                palingSering = arr[i];
            }
        }
        return palingSering;
    }
}
