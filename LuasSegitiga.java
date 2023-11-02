/**
     * Program ini menghitung luas segitiga dengan menggunakan formula:
     * Luas = (Alas * Tinggi) / 2
     *
     * @author Iftitah_258
     */

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator Luas Segitiga");
        System.out.print("Masukkan panjang alas: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double luas = hitungLuasSegitiga(alas, tinggi);

        System.out.println("Luas segitiga: " + luas);
        input.close();
    }

    /**
     * Fungsi ini menghitung luas segitiga berdasarkan panjang alas dan tinggi.
     *
     * @param alas   Panjang alas segitiga.
     * @param tinggi Tinggi segitiga.
     * @return Luas segitiga yang dihitung.
     */
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }
}


