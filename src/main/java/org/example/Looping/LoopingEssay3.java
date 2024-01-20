package org.example.Looping;

public class LoopingEssay3 {
    public static void main(String[] args) {
        int jumlahOrang = 10;
        boolean isFull = false;
        do {
            System.out.println("Jumlah orang dalam ruangan: " + jumlahOrang);
            jumlahOrang += 5;
        } while (jumlahOrang < 50);
        isFull = true;
        System.out.println("Ruangan sudah penuh");
    }
}
