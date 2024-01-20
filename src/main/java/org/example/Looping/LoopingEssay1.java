package org.example.Looping;

import java.util.Scanner;

public class LoopingEssay1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int pangkat = input.nextInt();
        int count = 1;
        int n1 = n;
        while (count < pangkat) {
            n1 = n1*n;
            count++;
        }
        System.out.println(n1);
    }
}
