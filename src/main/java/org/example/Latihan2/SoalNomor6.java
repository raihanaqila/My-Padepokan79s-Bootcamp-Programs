package org.example.Latihan2;
import java.util.Scanner;

class Point {
    int x;
    int y;

    // Constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class SoalNomor6 {
    public static void main(String[] args) {
        // Membuat array M dan N dari objek Point
        Point[] M = new Point[5];
        Point[] N = new Point[5];

        // Membaca input untuk array M
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            M[i] = new Point(x, y);
        }

        // Membaca input untuk array N
        for (int i = 0; i < 5; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            N[i] = new Point(x, y);
        }

        // Memeriksa apakah array M dan N sama
        boolean sama = true;
        for (int i = 0; i < 5; i++) {
            if (M[i].x != N[i].x || M[i].y != N[i].y) {
                sama = false;
                break;
            }
        }

        // Menampilkan output
        if (sama) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
        }
    }
}
