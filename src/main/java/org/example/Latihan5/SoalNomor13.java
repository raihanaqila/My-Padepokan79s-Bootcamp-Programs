package org.example.Latihan5;

import java.util.Arrays;
import java.util.Scanner;

public class SoalNomor13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String init = input.nextLine();
        String[] numbersAsString = init.split(" ");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }
        int N = numbers[0];
        int S = numbers[1];
        int X[] = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = input.nextInt();
        }
        binarySearch(X, S);
    }
    public static int binarySearch(int[] data, int target) {
        Arrays.sort(data);
        int iterasi = 0;
        int low = 0;
        int high = data.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            iterasi++;
            int midValue = data[mid];
            if (midValue < target) {
                low = mid + 1;
            }
            else if (midValue == target) {
                System.out.println(iterasi);
                System.out.println("found");
                return iterasi;
            }
            else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }
        System.out.println(iterasi);
        System.out.println("not found");
        return iterasi;
    }
}
