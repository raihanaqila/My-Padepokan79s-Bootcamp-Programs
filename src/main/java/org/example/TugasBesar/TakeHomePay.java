package org.example.TugasBesar;

// Tugas Besar Kelas CodeExpress Vol. 1
// Telekom Polban
// Raihan Aqila Thahir [2103]

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class TakeHomePay {
    // Aplikasi untuk menghitung Take Home Pay Karyawan PT. SMS
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang di Aplikasi Menghitung Take Home Pay Karyawan PT. SMS");

        // Input Nama Pegawai
        System.out.print("Masukkan Nama Pegawai: ");
        String namaPegawai = input.nextLine();  // Memasukkan Nama Pegawai
        boolean isNamaValid = true;
        for (char character : namaPegawai.toCharArray()) {  // Looping For-Each
            if (Character.isDigit(character)) { // Pengecekan. Jika ada Number maka Nama Pegawai tidak valid.
                isNamaValid = false;
                System.out.println("Maaf, Nama yang Anda masukkan tidak valid.");
                System.exit(1); // End Program
            }
        }

        // Input Posisi / Jabatan Karyawan
        System.out.print("Masukkan Posisi Pegawai: ");
        String posisi = input.nextLine();   // Memasukkan Posisi Pegawai
        boolean isPosisiValid = false;
        String[] posisiTersedia = {"Programmer", "Tester", "Scrum Master", "HRD"};
        int posisiIndex = -1;
        for (char character : posisi.toCharArray()) {   // Looping For-Each
            if (Character.isDigit(character)) { // Pengecekan. Jika ada Number maka Posisi tidak valid.
                isPosisiValid = false;
                System.out.println("Maaf, Posisi yang Anda masukkan tidak valid.");
                System.exit(1); // End Program
            }
        }
        for (int i = 0; i < posisiTersedia.length; i++) {
            if (posisi.equalsIgnoreCase(posisiTersedia[i])) {   // Menangkap Index dari Array
                posisiIndex = i;    // Index ditangkap untuk dibawa ke proses perhitungan
                isPosisiValid = true;
                break;
            }
        }
        if (!isPosisiValid) {   // Jika Posisi yang diinputkan tidak ada di Array
            System.out.println("Maaf, Posisi yang Anda masukkan tidak tersedia.");
            System.exit(1);
        }

        // Input Penempatan
        System.out.print("Masukkan Lokasi Penempatan Kerja: ");
        String penempatan = input.nextLine();
        boolean isPenempatanValid = true;
        String[] penempatanTersedia = {"Bandung", "Garut", "Jakarta", "Bekasi", "Bogor", "Karawang"};
        int penempatanIndex = -1;
        for (char character : penempatan.toCharArray()) {
            if (Character.isDigit(character)) {
                isPenempatanValid = false;
                System.out.println("Maaf, Lokasi Penempatan yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        for (int i = 0; i < penempatanTersedia.length; i++) {
            if (penempatan.equalsIgnoreCase(penempatanTersedia[i])) {
                penempatanIndex = i;
                isPenempatanValid = true;
                break;
            }
        }
        if (!isPenempatanValid) {
            System.out.println("Maaf, Lokasi Penempatan yang Anda masukkan tidak tersedia.");
            System.exit(1);
        }

        // Input Tingkatan Karyawan
        System.out.print("Masukkan Tingkatan Karyawan: ");
        String tingkatanKaryawan = input.nextLine();
        boolean isTingkatanValid = false;
        String[] tingkatanTersedia = {"Intern", "Junior", "Middle", "Senior"};
        int tingkatanIndex = -1;
        for (char character : tingkatanKaryawan.toCharArray()) {
            if (Character.isDigit(character)) {
                isTingkatanValid = false;
                System.out.println("Maaf, Tingkatan Karyawan yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        if (posisiIndex == 3) { // Kalau HRD
            for (int i = 0; i < tingkatanTersedia.length; i++) {
                if (tingkatanKaryawan.equalsIgnoreCase(tingkatanTersedia[i])) {
                    tingkatanIndex = i;
                    isTingkatanValid = true;
                    break;
                }
            }
        }
        else { // Kalau bukan HRD
            for (int i = 1; i < tingkatanTersedia.length; i++) {
                if (tingkatanKaryawan.equalsIgnoreCase(tingkatanTersedia[i])) {
                    tingkatanIndex = i;
                    isTingkatanValid = true;
                    break;
                }
            }
        }
        if (!isTingkatanValid) {
            System.out.println("Maaf, Tingkatan Karyawan yang Anda masukkan tidak tersedia.");
            System.exit(1);
        }

        // Input Masa Kerja
        System.out.print("Masukkan Masa Kerja: ");
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
        int masaKerjaIndex = -1;
        if (nMasaKerja >= 0 && nMasaKerja <= 30) {
            isMasaKerjaValid = true;
            if (nMasaKerja >= 10 && nMasaKerja <= 30) {
                masaKerjaIndex = 10;
            }
            else {
                masaKerjaIndex = nMasaKerja;
            }
        }
        else {
            isMasaKerjaValid = false;
            System.out.println("Maaf, Masa Kerja yang Anda masukkan tidak tersedia.");
            System.exit(1);
        }

        // Input Status Pernikahan
        System.out.print("Masukkan Status Pernikahan: ");
        String status = input.nextLine();
        boolean isStatusValid = true;
        String[] statusTersedia = {"Kawin", "Belum Kawin", "Cerai"};
        int statusIndex = -1;
        for (char character : status.toCharArray()) {
            if (Character.isDigit(character)) {
                isStatusValid = false;
                System.out.println("Maaf, Status Pernikahan yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        for (int i = 0; i < statusTersedia.length; i++) {
            if (status.equalsIgnoreCase(statusTersedia[i])) {
                statusIndex = i;
                isStatusValid = true;
                break;
            }
        }
        if (!isStatusValid) {
            System.out.println("Maaf, Status Pernikahan yang Anda masukkan tidak tersedia.");
            System.exit(1);
        }

        // Input Jumlah Anak
        System.out.print("Masukkan Jumlah Anak: ");
        String jumlahAnak = input.nextLine();
        boolean isJumlahAnakValid = true;
        for (char character : jumlahAnak.toCharArray()) {
            if (!Character.isDigit(character)) {
                isJumlahAnakValid = false;
                System.out.println("Maaf, Jumlah Anak yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        int nJumlahAnak = Integer.parseInt(jumlahAnak);
        int jumlahAnakIndex = -1;
        if (nJumlahAnak >= 0 && nJumlahAnak <= 30) {
            isJumlahAnakValid = true;
            if (nJumlahAnak >= 4 && nJumlahAnak <= 30) {
                jumlahAnakIndex = 4;
            }
            else {
                jumlahAnakIndex = nJumlahAnak;
            }
        }
        else {
            isJumlahAnakValid = false;
            System.out.println("Maaf, Jumlah Anak yang Anda masukkan tidak tersedia.");
            System.exit(1);
        }

        // Mendeklarasikan hasil perhitungan oleh beragam Function
        double ratesGaji = getRatesGaji(posisiIndex, masaKerjaIndex, tingkatanIndex);
        int gajiPokok = kalkulasiGajiPokok(ratesGaji, penempatanIndex);
        int tunjJabatan = kalkulasiTunjJabatan(posisiIndex, gajiPokok);
        int tunjKeluarga = kalkulasiTunjKeluarga(statusIndex, gajiPokok);
        int tunjAnak = kalkulasiTunjAnak(jumlahAnakIndex, gajiPokok);
        int tunjTingkatan = kalkulasiTunjTingkatan(tingkatanIndex);
        int tunjTransport = kalkulasiTunjTransport(penempatanIndex);
        int penghasilanBruto = kalkulasiGajiBruto(gajiPokok, tunjJabatan, tunjKeluarga, tunjTransport, tunjTingkatan, tunjAnak);
        int potonganPph = kalkulasiPph(penghasilanBruto, statusIndex, jumlahAnakIndex);
        int potonganBPJSTenagaKerja = kalkulasiPotonganBPJSTenagaKerja(penghasilanBruto);
        int potonganBPJSKesehatan = kalkulasiPotonganBPJSKesehatan(penghasilanBruto);
        int takeHomePay = kalkulasiTakeHomePay(penghasilanBruto, potonganPph, potonganBPJSTenagaKerja, potonganBPJSKesehatan);

        System.out.println();

        // Membuat Format Header Output
        String text = "SLIP GAJI KARYAWAN";
        int width = 60;
        int padding = (width - text.length()) / 2;
        String title = String.format("%" + (padding + text.length()) + "s", text);
        System.out.println(title);

        int padding2 = (width - namaPegawai.length()) / 2;
        String namaHeader = String.format("%" + (padding2 + namaPegawai.length()) + "s", namaPegawai);
        System.out.println(namaHeader);

        String lGajiPokok = "Gaji Pokok";
        String lTunjJabatan = "Tunjangan Jabatan";
        String lTunjKeluarga = "Tunjangan Keluarga";
        String lTunjAnak = "Tunjangan Anak";
        String lTunjTingkatan = "Tunjangan Tingkatan";
        String lTunjTransport = "Tunjangan Transport";
        String lPenghasilanBruto = "Penghasilan Bruto";
        String lPotonganPph = "Potongan Pph";
        String lBpjsTenagaKerja = "Potongan Bpjs Tenaga Kerja";
        String lBpjsKesehatan = "Potongan Kesehatan";
        String lTakeHomePay = "Take Home Pay/Gaji Bersih";

        // Format Nilai hasil perhitungan menjadi format Mata Uang Rupiah
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String gajiFormatted = formatRupiah.format(gajiPokok);
        String tunjJabatanFormatted = formatRupiah.format(tunjJabatan);
        String tunjKeluargaFormatted = formatRupiah.format(tunjKeluarga);
        String tunjAnakFormatted = formatRupiah.format(tunjAnak);
        String tunjTingkatanFormatted = formatRupiah.format(tunjTingkatan);
        String tunjTransportFormatted = formatRupiah.format(tunjTransport);
        String penghasilanBrutoFormatted = formatRupiah.format(penghasilanBruto);
        String potonganPphFormatted = formatRupiah.format(potonganPph);
        String potonganBPJSTenagaKerjaFormatted = formatRupiah.format(potonganBPJSTenagaKerja);
        String potonganBPJSKesehatanFormatted = formatRupiah.format(potonganBPJSKesehatan);
        String takeHomePayFormatted = formatRupiah.format(takeHomePay);

        // Menghilangkan ",00" agar lebih sesuai dengan contoh hasil
        // Rp4.500.000,00 -> Rp4.500.000
        String gajiSubstring = gajiFormatted.substring(0, gajiFormatted.length() - 3);
        String tunjJabatanSubstring = tunjJabatanFormatted.substring(0, tunjJabatanFormatted.length() - 3);
        String tunjKeluargaSubstring = tunjKeluargaFormatted.substring(0, tunjKeluargaFormatted.length() - 3);
        String tunjAnakSubstring = tunjAnakFormatted.substring(0, tunjAnakFormatted.length() - 3);
        String tunjTingkatanSubstring = tunjTingkatanFormatted.substring(0, tunjTingkatanFormatted.length() - 3);
        String tunjTransportSubstring = tunjTransportFormatted.substring(0, tunjTransportFormatted.length() - 3);
        String penghasilanBrutoSubstring = penghasilanBrutoFormatted.substring(0, penghasilanBrutoFormatted.length() - 3);
        String potonganPphSubstring = potonganPphFormatted.substring(0, potonganPphFormatted.length() - 3);
        String potonganBPJSTenagaKerjaSubstring = potonganBPJSTenagaKerjaFormatted.substring(0, potonganBPJSTenagaKerjaFormatted.length() - 3);
        String potonganBPJSKesehatanSubstring = potonganBPJSKesehatanFormatted.substring(0, potonganBPJSKesehatanFormatted.length() - 3);
        String takeHomePaySubstring = takeHomePayFormatted.substring(0, takeHomePayFormatted.length() - 3);

        // Print Hasil Akhir
        System.out.printf("%-40s %s%n", lGajiPokok, gajiSubstring);
        System.out.printf("%-40s %s%n", lTunjJabatan, tunjJabatanSubstring);
        System.out.printf("%-40s %s%n", lTunjKeluarga, tunjKeluargaSubstring);
        System.out.printf("%-40s %s%n", lTunjAnak, tunjAnakSubstring);
        System.out.printf("%-40s %s%n", lTunjTingkatan, tunjTingkatanSubstring);
        System.out.printf("%-40s %s%n", lTunjTransport, tunjTransportSubstring);
        System.out.printf("%-40s %s%n", lPenghasilanBruto, penghasilanBrutoSubstring);
        System.out.printf("%-40s %s%n", lPotonganPph, potonganPphSubstring);
        System.out.printf("%-40s %s%n", lBpjsTenagaKerja, potonganBPJSTenagaKerjaSubstring);
        System.out.printf("%-40s %s%n", lBpjsKesehatan, potonganBPJSKesehatanSubstring);
        System.out.printf("%-40s %s%n", lTakeHomePay, takeHomePaySubstring);
    }
    private static double getRatesGaji(int a, int b, int c) {
        // a = posisiIndex
        // b = masaKerjaIndex
        // c = tingkatanIndex
        double[][][] ratesGaji = new double[4][11][4];

        switch(a) {
            case 0: // posisi = "Programmer"
                switch(b) {
                    case 0: // masaKerja = 0
                        ratesGaji[a][b][1] = 120; ratesGaji[a][b][2] = 150; ratesGaji[a][b][3] = 170;
                        break;
                    case 1: // masaKerja = 1
                        ratesGaji[a][b][1] = 120; ratesGaji[a][b][2] = 150; ratesGaji[a][b][3] = 170;
                        break;
                    case 2: // masaKerja = 2
                        ratesGaji[a][b][1] = 120; ratesGaji[a][b][2] = 150; ratesGaji[a][b][3] = 170;
                        break;
                    case 3: // masaKerja = 3
                        ratesGaji[a][b][1] = 140; ratesGaji[a][b][2] = 160; ratesGaji[a][b][3] = 170;
                        break;
                    case 4: // masaKerja = 4
                        ratesGaji[a][b][1] = 140; ratesGaji[a][b][2] = 160; ratesGaji[a][b][3] = 200;
                        break;
                    case 5: // masaKerja = 5
                        ratesGaji[a][b][1] = 140; ratesGaji[a][b][2] = 160; ratesGaji[a][b][3] = 200;
                        break;
                    case 6: // masaKerja = 6
                        ratesGaji[a][b][1] = 142; ratesGaji[a][b][2] = 162; ratesGaji[a][b][3] = 202;
                        break;
                    case 7: // masaKerja = 7
                        ratesGaji[a][b][1] = 144; ratesGaji[a][b][2] = 164; ratesGaji[a][b][3] = 204;
                        break;
                    case 8: // masaKerja = 8
                        ratesGaji[a][b][1] = 146; ratesGaji[a][b][2] = 166; ratesGaji[a][b][3] = 206;
                        break;
                    case 9: // masaKerja = 9
                        ratesGaji[a][b][1] = 148; ratesGaji[a][b][2] = 168; ratesGaji[a][b][3] = 208;
                        break;
                    default: // masaKerja = 10
                        ratesGaji[a][b][1] = 150; ratesGaji[a][b][2] = 170; ratesGaji[a][b][3] = 210;
                        break;
                }
                break;

            case 1: // posisi = "Tester"
                switch(b) {
                    case 0: // masaKerja = 0
                        ratesGaji[a][b][1] = 100; ratesGaji[a][b][2] = 130; ratesGaji[a][b][3] = 150;
                        break;
                    case 1: // masaKerja = 1
                        ratesGaji[a][b][1] = 100; ratesGaji[a][b][2] = 130; ratesGaji[a][b][3] = 150;
                        break;
                    case 2: // masaKerja = 2
                        ratesGaji[a][b][1] = 100; ratesGaji[a][b][2] = 130; ratesGaji[a][b][3] = 150;
                        break;
                    case 3: // masaKerja = 3
                        ratesGaji[a][b][1] = 120; ratesGaji[a][b][2] = 140; ratesGaji[a][b][3] = 150;
                        break;
                    case 4: // masaKerja = 4
                        ratesGaji[a][b][1] = 120; ratesGaji[a][b][2] = 140; ratesGaji[a][b][3] = 160;
                        break;
                    case 5: // masaKerja = 5
                        ratesGaji[a][b][1] = 120; ratesGaji[a][b][2] = 140; ratesGaji[a][b][3] = 160;
                        break;
                    case 6: // masaKerja = 6
                        ratesGaji[a][b][1] = 122; ratesGaji[a][b][2] = 142; ratesGaji[a][b][3] = 162;
                        break;
                    case 7: // masaKerja = 7
                        ratesGaji[a][b][1] = 124; ratesGaji[a][b][2] = 144; ratesGaji[a][b][3] = 164;
                        break;
                    case 8: // masaKerja = 8
                        ratesGaji[a][b][1] = 126; ratesGaji[a][b][2] = 146; ratesGaji[a][b][3] = 166;
                        break;
                    case 9: // masaKerja = 9
                        ratesGaji[a][b][1] = 128; ratesGaji[a][b][2] = 148; ratesGaji[a][b][3] = 168;
                        break;
                    default: // masaKerja = 10
                        ratesGaji[a][b][1] = 130; ratesGaji[a][b][2] = 150; ratesGaji[a][b][3] = 170;
                        break;
                }
                break;

            case 2: // posisi = "Scrum Master"
                switch(b) {
                    case 0: // masaKerja = 0
                        ratesGaji[a][b][1] = 130; ratesGaji[a][b][2] = 160; ratesGaji[a][b][3] = 180;
                        break;
                    case 1: // masaKerja = 1
                        ratesGaji[a][b][1] = 130; ratesGaji[a][b][2] = 160; ratesGaji[a][b][3] = 180;
                        break;
                    case 2: // masaKerja = 2
                        ratesGaji[a][b][1] = 130; ratesGaji[a][b][2] = 160; ratesGaji[a][b][3] = 180;
                        break;
                    case 3: // masaKerja = 3
                        ratesGaji[a][b][1] = 150; ratesGaji[a][b][2] = 175; ratesGaji[a][b][3] = 180;
                        break;
                    case 4: // masaKerja = 4
                        ratesGaji[a][b][1] = 150; ratesGaji[a][b][2] = 175; ratesGaji[a][b][3] = 200;
                        break;
                    case 5: // masaKerja = 5
                        ratesGaji[a][b][1] = 150; ratesGaji[a][b][2] = 175; ratesGaji[a][b][3] = 200;
                        break;
                    case 6: // masaKerja = 6
                        ratesGaji[a][b][1] = 152; ratesGaji[a][b][2] = 176; ratesGaji[a][b][3] = 202;
                        break;
                    case 7: // masaKerja = 7
                        ratesGaji[a][b][1] = 154; ratesGaji[a][b][2] = 177; ratesGaji[a][b][3] = 204;
                        break;
                    case 8: // masaKerja = 8
                        ratesGaji[a][b][1] = 156; ratesGaji[a][b][2] = 178; ratesGaji[a][b][3] = 206;
                        break;
                    case 9: // masaKerja = 9
                        ratesGaji[a][b][1] = 158; ratesGaji[a][b][2] = 179; ratesGaji[a][b][3] = 208;
                        break;
                    default: // masaKerja = 10
                        ratesGaji[a][b][1] = 160; ratesGaji[a][b][2] = 180; ratesGaji[a][b][3] = 210;
                        break;
                }
                break;

            default: // posisi = "HRD"
                switch(b) {
                    case 0: // masaKerja = 0
                        ratesGaji[a][b][0] = 80; ratesGaji[a][b][1] = 100; ratesGaji[a][b][2] = 120; ratesGaji[a][b][3] = 140;
                        break;
                    case 1: // masaKerja = 1
                        ratesGaji[a][b][0] = 80; ratesGaji[a][b][1] = 100; ratesGaji[a][b][2] = 120; ratesGaji[a][b][3] = 140;
                        break;
                    case 2: // masaKerja = 2
                        ratesGaji[a][b][0] = 80; ratesGaji[a][b][1] = 100; ratesGaji[a][b][2] = 120; ratesGaji[a][b][3] = 140;
                        break;
                    case 3: // masaKerja = 3
                        ratesGaji[a][b][0] = 80; ratesGaji[a][b][1] = 100; ratesGaji[a][b][2] = 130; ratesGaji[a][b][3] = 150;
                        break;
                    case 4: // masaKerja = 4
                        ratesGaji[a][b][0] = 80; ratesGaji[a][b][1] = 100; ratesGaji[a][b][2] = 130; ratesGaji[a][b][3] = 150;
                        break;
                    case 5: // masaKerja = 5
                        ratesGaji[a][b][0] = 80; ratesGaji[a][b][1] = 110; ratesGaji[a][b][2] = 130; ratesGaji[a][b][3] = 150;
                        break;
                    case 6: // masaKerja = 6
                        ratesGaji[a][b][0] = 100; ratesGaji[a][b][1] = 110; ratesGaji[a][b][2] = 130; ratesGaji[a][b][3] = 150;
                        break;
                    case 7: // masaKerja = 7
                        ratesGaji[a][b][0] = 100; ratesGaji[a][b][1] = 112; ratesGaji[a][b][2] = 132; ratesGaji[a][b][3] = 152;
                        break;
                    case 8: // masaKerja = 8
                        ratesGaji[a][b][0] = 100; ratesGaji[a][b][1] = 114; ratesGaji[a][b][2] = 134; ratesGaji[a][b][3] = 154;
                        break;
                    case 9: // masaKerja = 9
                        ratesGaji[a][b][0] = 100; ratesGaji[a][b][1] = 116; ratesGaji[a][b][2] = 136; ratesGaji[a][b][3] = 156;
                        break;
                    default: // masaKerja = 10
                        ratesGaji[a][b][0] = 100; ratesGaji[a][b][1] = 118; ratesGaji[a][b][2] = 138; ratesGaji[a][b][3] = 158;
                        break;
                }
                break;
        }
        return ratesGaji[a][b][c] / 100; // ratesGaji[a][b][c]%
    }
    private static int kalkulasiGajiPokok (double a, int b) {
        // a = getRatesGaji(posisiIndex, masaKerjaIndex, tingkatanIndex)
        // b = penempatanIndex
        double gajiPokok; // gajiPokok = ratesGaji[a][b][c]% * UMK
        switch(b) {
            case 0: // penempatan = "Bandung"
                gajiPokok = a * 3800000;
                break;
            case 1: // penempatan = "Garut"
                gajiPokok = a * 2000000;
                break;
            case 2: // penempatan = "Jakarta"
                gajiPokok = a * 4500000;
                break;
            case 3: // penempatan = "Bekasi"
                gajiPokok = a * 4800000;
                break;
            case 4: // penempatan = "Bogor"
                gajiPokok = a * 4300000;
                break;
            default: // penempatan = "Karawang"
                gajiPokok = a * 5000000;
                break;
        }
        return (int) gajiPokok; // pengembalian nilai double ke nilai int
    }
    private static int kalkulasiTunjKeluarga(int a, int b) {
        // a = statusIndex
        // b = kalkulasiGajiPokok(getRatesGaji(posisiIndex, masaKerjaIndex, tingkatanIndex), penempatanIndex)
        int tunjKeluarga;
        switch(a) {
            case 0: // status = "Kawin"
                tunjKeluarga = b * 5 / 100;
                break;
            default: // status = "Belum Kawin" || status = "Cerai"
                tunjKeluarga = 0;
                break;
        }
        return tunjKeluarga;
    }
    private static int kalkulasiTunjAnak(int a, int b) {
        // a = jumlahAnakIndex
        // b = kalkulasiGajiPokok(getRatesGaji(posisiIndex, masaKerjaIndex, tingkatanIndex), penempatanIndex)
        double tunjAnak;
        switch(a) {
            case 0: // jumlahAnak = 0
                tunjAnak = 0;
                break;
            case 1, 2, 3: // jumlahAnak = 1 || jumlahAnak = 2 || jumlahAnak = 3
                tunjAnak = a * b * 2.5 / 100; // 2.5% = 2.5 / 100
                break;
            default: // jumlahAnak >= 4
                tunjAnak = 4 * b * 2.5 / 100; // 2.5% = 2.5 / 100
                break;
        }
        return (int) tunjAnak;
    }
    private static int kalkulasiTunjJabatan(int a, int b) {
        // a = posisiIndex
        // b = kalkulasiGajiPokok(getRatesGaji(a, masaKerjaIndex, tingkatanIndex), penempatanIndex)
        int tunjJabatan;
        switch(a) {
            case 0, 3: // posisi = "Programmer" || posisi = "HRD"
                tunjJabatan = b * 10 / 100;
                break;
            case 1: // posisi = "Tester"
                tunjJabatan = b * 15 / 100;
                break;
            default: // posisi = "Scrum Master"
                tunjJabatan = b * 20 / 100;
                break;
        }
        return tunjJabatan;
    }
    private static int kalkulasiTunjTingkatan(int a) {
        // a = tingkatanIndex
        int tunjTingkatan;
        switch(a) {
            case 0: // tingkatanKaryawan = "Intern"
                tunjTingkatan = 0;
                break;
            case 1: // tingkatanKaryawan = "Junior"
                tunjTingkatan = 250000;
                break;
            case 2: // tingkatanKaryawan = "Middle"
                tunjTingkatan = 500000;
                break;
            default: // tingkatanKaryawan = "Senior"
                tunjTingkatan = 1000000;
                break;
        }
        return tunjTingkatan;
    }
    private static int kalkulasiTunjTransport(int a) {
        // a = penempatanIndex
        int tunjTransport;
        switch(a) {
            case 0, 2: // penempatan = "Bandung" || penempatan = "Jakarta"
                tunjTransport = 250000;
                break;
            default:
                tunjTransport = 0;
                break;
        }
        return tunjTransport;
    }
    private static int kalkulasiGajiBruto(int a, int b, int c, int d, int e, int f) {
        // a = kalkulasiGajiPokok(getRatesGaji(posisiIndex, masaKerjaIndex, tingkatanIndex), penempatanIndex)
        // b = kalkulasiTunjJabatan(posisiIndex, a)
        // c = kalkulasiTunjKeluarga(statusIndex, a)
        // d = kalkulasiTunjTransport(penempatanIndex)
        // e = kalkulasiTunjTingkatan(tingkatanIndex)
        // f = kalkulasiTunjAnak(jumlahAnakIndex)
        int gajiBruto = a + b + c + d + e + f;
        return gajiBruto;
    }
    private static int kalkulasiPph(int a, int b, int c) {
        // a = kalkulasiGajiBruto(...)
        // b = statusIndex
        // c = jumlahAnakIndex
        int pph = 0;
        int pkp, ptkp;
        if (a < 4000000) { // Tidak Wajib Pajak
            pph = 0;
        }
        else { // Wajib Pajak
            ptkp = 36000000;
            switch(b) {
                case 0: // status = "Kawin"
                    switch(c) {
                        case 0: // jumlahAnak = 0
                            ptkp += 3000000;
                            break;
                        case 1, 2: // jumlahAnak = 1 || jumlahAnak = 2
                            ptkp += c * 3000000 + 3000000;
                            break;
                        default: // jumlahAnak >= 3
                            ptkp += 3 * 3000000 + 3000000;
                            break;
                    }
                    break;
                default: // status = "Belum Kawin" || status = "Cerai"
                    switch(c) {
                        case 0: // jumlahAnak = 0
                            break;
                        case 1, 2: // jumlahAnak = 1 || jumlahAnak = 2
                            ptkp += c * 3000000;
                            break;
                        default: // jumlahAnak >= 3
                            ptkp += 3 * 3000000;
                            break;
                    }
                    break;
            }
            pkp = a * 12 - ptkp;
            pph = pkp / 12 * 5 / 100;
        }
        return pph;
    }
    private static int kalkulasiPotonganBPJSTenagaKerja(int a) {
        // a = kalkulasiGajiBruto(...)
        double potonganBPJSTenagaKerja = a * 3.5 / 100; // 3.5% = 3.5 / 100
        return (int) potonganBPJSTenagaKerja;
    }
    private static int kalkulasiPotonganBPJSKesehatan(int a) {
        // a = kalkulasiGajiBruto(...)
        double potonganBPJSKesehatan = a * 1.5 / 100; // 1.5% = 1.5 / 100
        return (int) potonganBPJSKesehatan;
    }
    private static int kalkulasiTakeHomePay(int a, int b, int c, int d) {
        // a = kalkulasiGajiBruto(...)
        // b = kalkulasiPph(a, statusIndex, jumlahAnakIndex)
        // c = kalkulasiPotonganBPJSTenagaKerja(a)
        // d = kalkulasiPotonganBPJSKesehatan(a)
        int takeHomePay = a - (b + c + d); // Gaji Bruto dikurangi Semua Potongan (pph + BPJS Tenaga Kerja + BPJS Kesehatan)
        return takeHomePay;
    }
}