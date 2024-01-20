package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n2 < n3) {
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n1 + " " + n2 + " " + n3);
    }
}
