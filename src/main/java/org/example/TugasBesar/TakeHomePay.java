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
        int posisiIndex = -1;
        for (char character : posisi.toCharArray()) {
            if (Character.isDigit(character)) {
                isPosisiValid = false;
                System.out.println("Maaf, Posisi yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        for (String allowedPosition : posisiTersedia) {
            if (posisi.equalsIgnoreCase(allowedPosition)) {
                for (int i = 0; i < posisiTersedia.length; i++) {
                    if (posisi.equalsIgnoreCase(posisiTersedia[i])) {
                        posisiIndex = i;
                        isPosisiValid = true;
                        break;
                    }
                }
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
        int penempatanIndex = -1;
        for (char character : penempatan.toCharArray()) {
            if (Character.isDigit(character)) {
                isPenempatanValid = false;
                System.out.println("Maaf, Lokasi Penempatan yang Anda masukkan tidak valid.");
                System.exit(1);
            }
        }
        for (String allowedPlacement : penempatanTersedia) {
            if (penempatan.equalsIgnoreCase(allowedPlacement)) {
                for (int i = 0; i < penempatanTersedia.length; i++) {
                    if (penempatan.equalsIgnoreCase(penempatanTersedia[i])) {
                        penempatanIndex = i;
                        isPenempatanValid = true;
                        break;
                    }
                }
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
        int tingkatanIndex = -1;
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
                    for (int i = 0; i < tingkatanTersedia.length; i++) {
                        if (tingkatanKaryawan.equalsIgnoreCase(tingkatanTersedia[i])) {
                            tingkatanIndex = i;
                            isTingkatanValid = true;
                            break;
                        }
                    }
                }
                else {
                    if (tingkatanKaryawan.equalsIgnoreCase(tingkatanTersedia[0])) {
                        isTingkatanValid = false;
                        System.out.println("Maaf, Tingkatan Karyawan yang Anda masukkan tidak tersedia.");
                        System.exit(1);
                    }
                    else {
                        for (int i = 0; i < tingkatanTersedia.length; i++) {
                            if (tingkatanKaryawan.equalsIgnoreCase(tingkatanTersedia[i])) {
                                tingkatanIndex = i;
                                isTingkatanValid = true;
                                break;
                            }
                        }
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
            int masaKerjaIndex = -1;
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
        System.out.println("Masukkan Status Pernikahan: ");
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
        for (String allowedStatus : statusTersedia) {
            if (status.equalsIgnoreCase(allowedStatus)) {
                for (int i = 0; i < statusTersedia.length; i++) {
                    if (status.equalsIgnoreCase(statusTersedia[i])) {
                        statusIndex = i;
                        isStatusValid = true;
                        break;
                    }
                }
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
            int jumlahAnakIndex = -1;
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

    }
    private static int getRatesGaji(int a, int b, int c) {
        // a = posisiIndex
        // b = masaKerjaIndex
        // c = tingkatanIndex
        int[][][] ratesGaji = new int[4][11][4];

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
        return ratesGaji[a][b][c];
    }
    private static int kalkulasiGajiPokok (int a, int b) {
        // a = getRatesGaji(posisiIndex, masaKerjaIndex, tingkatanIndex)
        // b = penempatanIndex
        int gajiPokok;
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
        return gajiPokok;
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
        int tunjAnak;
        switch(a) {
            case 0: // jumlahAnak = 0
                tunjAnak = 0;
                break;
            case 1, 2, 3: // jumlahAnak = 1 || jumlahAnak = 2 || jumlahAnak = 3
                tunjAnak = a * b * 25 / 1000; // 2.5% = 2.5 / 100 = 25 / 1000
                break;
            default: // jumlahAnak >= 4
                tunjAnak = 4 * b * 25 / 1000; // 2.5% = 2.5 / 100 = 25 / 1000
                break;
        }
        return tunjAnak;
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
            case 0:
                tunjTingkatan = 0;
                break;
            case 1:
                tunjTingkatan = 250000;
                break;
            case 2:
                tunjTingkatan = 500000;
                break;
            default:
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
    private static int kalkulasiGajiBruto(int a, int b, int c, int d) {
        // a = kalkulasiGajiPokok(getRatesGaji(posisiIndex, masaKerjaIndex, tingkatanIndex), penempatanIndex)
        // b = kalkulasiTunjJabatan(posisiIndex, a)
        // c = kalkulasiTunjKeluarga(statusIndex, a)
        // d = kalkulasiTunjTransport(penempatanIndex)
        int gajiBruto = a + b + c + d;
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
        int potonganBPJSTenagaKerja = a * 35 / 1000; // 3.5% = 3.5 * 100 = 35 / 1000
        return potonganBPJSTenagaKerja;
    }
    private static int kalkulasiPotonganBPJSKesehatan(int a) {
        // a = kalkulasiGajiBruto(...)
        int potonganBPJSKesehatan = a * 15 / 1000; // 1.5% = 1.5 * 100 = 15 / 1000
        return potonganBPJSKesehatan;
    }
    private static int kalkulasiTakeHomePay(int a, int b, int c, int d) {
        // a = kalkulasiGajiBruto(...)
        // b = kalkulasiPph(a, statusIndex, jumlahAnakIndex)
        // c = kalkulasiPotonganBPJSTenagaKerja(a)
        // d = kalkulasiPotonganBPJSKesehatan(a)
        int takeHomePay = a - (b + c + d);
        return takeHomePay;
    }
}
