package org.example.Looping;

public class LoopingEssay2 {
    public static void main(String[] args) {
        int poin = 0;
        for (int jTanding = 1; jTanding <= 10; jTanding++) {
            if (jTanding < 5) {
                poin += 1;
            }
            else {
                poin+= 3;
            }
        }
        System.out.println(poin);
    }
}
