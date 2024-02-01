package org.example.OOP.Materi7;

import org.example.OOP.Materi7.Interfaces.Phone;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //membuat object phone menggunakan instansiasi dari class Xiaomi
        Phone redmiNote10 = new Xiaomi();

        //membuat object PhoneUser
        PhoneUser dian = new PhoneUser(redmiNote10);

        //Nyalakan dulu HP
        dian.turnOnThePhone();

        //Membuat Tampilan
        Scanner input = new Scanner(System.in);
        String aksi;
        boolean isLooping = true;

        do {
            System.out.println("====Aplikasi Interface====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Perkecil Volume");
            System.out.println("[0] Keluar");
            System.out.println("==========================");

            System.out.println("Pilih Aksi : ");
            aksi = input.next();

            if(aksi.equalsIgnoreCase("1")) {
                dian.turnOnThePhone();
            }
            else if(aksi.equalsIgnoreCase("2")) {
                dian.turnOffThePhone();
            }
            else if(aksi.equalsIgnoreCase("3")) {
                dian.makePhoneLouder();
            }
            else if(aksi.equalsIgnoreCase("4")) {
                dian.makePhoneSilent();
            }
            else if(aksi.equalsIgnoreCase("0")) {
                isLooping = false;
            }
            else {
                System.out.println("Aksi yang Anda pilih tidak tersedia.");
                System.out.println("Silahkan Pilih Aksi Kembali.");
            }
        } while(isLooping);
    }
}
