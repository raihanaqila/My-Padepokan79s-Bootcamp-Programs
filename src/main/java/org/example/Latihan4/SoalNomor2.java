package org.example.Latihan4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SoalNomor2 {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
        int pKata = kata.length();
        char[] arr = new char[pKata];
        Set<Character> uniqueLetters = new HashSet<>();
        for (i = 0; i < pKata; i++) {
            arr[i] = Character.toLowerCase(kata.charAt(i));
        }
        boolean isValid = true;
        for (i = 0; i < pKata; i++) {
            char currentLetter = arr[i];
            uniqueLetters.add(currentLetter);
        }
        System.out.println(uniqueLetters.size());
    }
}
