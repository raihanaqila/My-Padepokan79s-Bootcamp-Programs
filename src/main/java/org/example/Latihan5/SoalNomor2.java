package org.example.Latihan5;

import java.util.Scanner;

public class SoalNomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String X = input.nextLine();
        String[] numbersAsString = X.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        String Y = input.nextLine();
        String[] numbersAsString2 = Y.split(" ");
        int[] numbers2 = new int[numbersAsString2.length];
        for (int i = 0; i < numbersAsString2.length; i++) {
            numbers2[i] = Integer.parseInt(numbersAsString2[i]);
        }

        long penyebutBersama = findKPK(numbers[1], numbers2[1]);
        long pembilangDisesuaikan1 = numbers[0] * (penyebutBersama / numbers[1]);
        long pembilangDisesuaikan2 = numbers2[0] * (penyebutBersama / numbers2[1]);

        long pembilang = pembilangDisesuaikan1 + pembilangDisesuaikan2;

        long fpb = findFPB(pembilang, penyebutBersama);
        pembilang /= fpb;
        penyebutBersama /= fpb;
        System.out.println(pembilang + " " + penyebutBersama);
    }
    public static long findFPB(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long findKPK(long a, long b) {
        return (a * b) / findFPB(a, b);
    }
}

