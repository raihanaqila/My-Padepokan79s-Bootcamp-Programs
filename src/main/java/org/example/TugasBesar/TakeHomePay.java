package org.example.TugasBesar;

// Tugas Besar Kelas CodeExpress Vol. 1
// Telekom Polban
// Peserta 1: Bayu Rahmat Ramadhan [2101]
// Peserta 2: Naira Ayu Aulia [2102]
// Peserta 3: Raihan Aqila Thahir [2103]
// Peserta 4: Syairra Putri Aprilliana [2104]

import java.util.Scanner;

public class TakeHomePay {
    // Aplikasi untuk menghitung Take Home Pay Karyawan PT. SMS
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang di Aplikasi Menghitung Take Home Pay Karyawan PT. SMS");

        // Input Nama Pegawai
        System.out.println("Masukkan Nama Pegawai: ");
        String namaPegawai = input.nextLine();
        boolean isNamaValid = true;
        for (char character : namaPegawai.toCharArray()) {
            if (Character.isDigit(character)) {
                isNamaValid = false;
                System.out.println("Maaf, Nama yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }

        // Input Posisi / Jabatan Karyawan
        System.out.println("Masukkan Posisi Pegawai: ");
        String posisi = input.nextLine();
        boolean isPosisiValid = true;
        String[] posisiTersedia = {"Programmer", "Tester", "Scrum Master", "HRD"};
        for (char character : posisi.toCharArray()) {
            if (Character.isDigit(character)) {
                isPosisiValid = false;
                System.out.println("Maaf, Posisi yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        for (String allowedPosition : posisiTersedia) {
            if (posisi.equalsIgnoreCase(allowedPosition)) {
                isPosisiValid = true;
            }
            else {
                isPosisiValid = false;
                System.out.println("Maaf, Posisi yang Anda masukkan tidak tersedia.");
                System.exit(1);
            }
        }

        // Input Penempatan
        System.out.println("Masukkan Lokasi Penempatan Kerja: ");
        String penempatan = input.nextLine();
        boolean isPenempatanValid = true;
        String[] penempatanTersedia = {"Bandung", "Garut", "Jakarta", "Bekasi", "Bogor", "Karawang"};
        for (char character : penempatan.toCharArray()) {
            if (Character.isDigit(character)) {
                isPenempatanValid = false;
                System.out.println("Maaf, Lokasi Penempatan yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        for (String allowedPlacement : penempatanTersedia) {
            if (penempatan.equalsIgnoreCase(allowedPlacement)) {
                isPenempatanValid = true;
            }
            else {
                isPenempatanValid = false;
                System.out.println("Maaf, Lokasi Penempatan yang Anda masukkan tidak tersedia.");
                System.exit(1);
            }
        }

        // Input Tingkatan Karyawan
        System.out.println("Masukkan Tingkatan Karyawan: ");
        String tingkatanKaryawan = input.nextLine();
        boolean isTingkatanValid = true;
        String[] tingkatanTersedia = {"Intern", "Junior", "Middle", "Senior"};
        for (char character : tingkatanKaryawan.toCharArray()) {
            if (Character.isDigit(character)) {
                isTingkatanValid = false;
                System.out.println("Maaf, Tingkatan Karyawan yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        for (String allowedLevel : tingkatanTersedia) {
            if (tingkatanKaryawan.equalsIgnoreCase(allowedLevel)) {
                if (posisi.equalsIgnoreCase(penempatanTersedia[3])) {
                    isTingkatanValid = true;
                }
                else {
                    if (tingkatanKaryawan.equalsIgnoreCase(tingkatanTersedia[0])) {
                        isTingkatanValid = false;
                        System.out.println("Maaf, Tingkatan Karyawan yang Anda masukkan tidak tersedia.");
                        System.exit(1);
                    }
                    else {
                        isTingkatanValid = true;
                    }
                }
            }
            else {
                isTingkatanValid = false;
                System.out.println("Maaf, Tingkatan Karyawan yang Anda masukkan tidak tersedia.");
                System.exit(1);
            }
        }

        // Input Masa Kerja
        System.out.println("Masukkan Masa Kerja: ");
        String masaKerja = input.nextLine();
        boolean isMasaKerjaValid = true;
        for (char character : masaKerja.toCharArray()) {
            if (!Character.isDigit(character)) {
                isMasaKerjaValid = false;
                System.out.println("Maaf, Masa Kerja yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        int nMasaKerja = Integer.parseInt(masaKerja);
        if (nMasaKerja >= 0 && nMasaKerja <= 30) {
            isMasaKerjaValid = true;
        }
        else {
            isMasaKerjaValid = false;
            System.out.println("Maaf, Masa Kerja yang Anda masukkan tidak tersedia.");
            System.exit(1);
        }

        // Input Status Pernikahan
        System.out.println("Masukkan Status Pernikahan: ");
        String status = input.nextLine();
        boolean isStatusValid = true;
        String[] statusTersedia = {"Kawin", "Belum Kawin", "Cerai"};
        for (char character : status.toCharArray()) {
            if (Character.isDigit(character)) {
                isStatusValid = false;
                System.out.println("Maaf, Status Pernikahan yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        for (String allowedStatus : statusTersedia) {
            if (posisi.equalsIgnoreCase(allowedStatus)) {
                isStatusValid = true;
            }
            else {
                isStatusValid = false;
                System.out.println("Maaf, Status Pernikahan yang Anda masukkan tidak tersedia.");
                System.exit(1);
            }
        }

        // Input Jumlah Anak
        System.out.println("Masukkan Jumlah Anak: ");
        String jumlahAnak = input.nextLine();
        boolean isJumlahAnakValid = true;
        for (char character : jumlahAnak.toCharArray()) {
            if (!Character.isDigit(character)) {
                isJumlahAnakValid = false;
                System.out.println("Maaf, Jumlah Anak yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        int nJumlahAnak = Integer.parseInt(masaKerja);
        if (nJumlahAnak >= 0 && nJumlahAnak <= 30) {
            isJumlahAnakValid = true;
        }
        else {
            isJumlahAnakValid = false;
            System.out.println("Maaf, Jumlah Anak yang Anda masukkan tidak tersedia.");
            System.exit(1);
        }

    }
    private static int getRatesGaji(int a, int b, int c) {
        return a;
    }
    private static int kalkulasiGajiPokok (int a, int b) {
        return a;
    }
    private static int kalkulasiTunjKeluarga(int a, int b) {
        return a;
    }
    private static int kalkulasiTunjAnak(int a, int b) {
        return a;
    }
    private static int kalkulasiTunjJabatan(int a, int b) {
        return a;
    }
    private static int kalkulasiTunjTingkatan(int a, int b) {
        return a;
    }
    private static int kalkulasiTunjTransport(int a, int b) {
        return a;
    }
    private static int kalkulasiGajiBruto(int a, int b) {
        return a;
    }
    private static int kalkulasiPph(int a, int b) {
        return a;
    }
    private static int kalkulasiPotonganBPJSTenagaKerja(int a, int b) {
        return a;
    }
    private static int kalkulasiPotonganBPJSKesehatan(int a, int b) {
        return a;
    }
    private static int kalkulasiTakeHomePay(int a, int b) {
        return a;
    }
}
