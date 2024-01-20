package org.example.Latihan2;

import java.util.Scanner;

public class SoalNomor7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        Point[] points = new Point[M];
        for (int i = 0; i < M; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            points[i] = new Point(x, y);
        }
        int N = input.nextInt();
        int jMuncul = 0;
        for (Point point : points) {
            if (point.x > 0 && point.y > 0 && N == 1) {
                jMuncul++;
            } else if (point.x < 0 && point.y > 0 && N == 2) {
                jMuncul++;
            } else if (point.x < 0 && point.y < 0 && N == 3) {
                jMuncul++;
            } else if (point.x > 0 && point.y < 0 && N == 4) {
                jMuncul++;
            }
        }
        System.out.println(jMuncul);
    }
}
