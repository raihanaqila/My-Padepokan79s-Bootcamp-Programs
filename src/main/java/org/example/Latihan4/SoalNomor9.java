package org.example.Latihan4;

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

public class SoalNomor9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        Point[] pointsA = new Point[M];
        for (int i = 0; i < M; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            pointsA[i] = new Point(x, y);
        }
        int N = input.nextInt();
        int jMuncul = 0;
        Point[] pointsB = new Point[M];
        int idxB = 0;
        for (Point point : pointsA) {
            if ((point.x > 0 && point.y > 0 && N == 1) ||
                    (point.x < 0 && point.y > 0 && N == 2) ||
                    (point.x < 0 && point.y < 0 && N == 3) ||
                    (point.x > 0 && point.y < 0 && N == 4)) {

                jMuncul++;
                pointsB[idxB++] = point;
            }
        }
        System.out.println(jMuncul);
        for (int i = 0; i < idxB; i++) {
            System.out.println(pointsB[i].x + " " + pointsB[i].y);
        }
    }
}
