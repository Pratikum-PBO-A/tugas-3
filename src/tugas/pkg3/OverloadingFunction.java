package TugasPraktikum;

import java.util.Scanner;
import java.io.*;

public class OverloadingFunction {

    private String hasil = "";
// konversi dari angka ke huruf

    public void method1(int satuan) {
        String[] huruf = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
        if (satuan < 12) {
            hasil = hasil + huruf[satuan];
        } else if (satuan < 20) {
            hasil = hasil + huruf[satuan - 10] + " Belas";
        } else if (satuan < 100) {
            hasil = hasil + huruf[satuan / 10] + " Puluh " + huruf[satuan % 10];
        } else if (satuan == 100) {
            hasil = hasil + "Seratus";
        } else {
            hasil = hasil + "Maaf, program ini hanya untuk angka 0-100";
        }
        System.out.println(hasil);
    }
// konversi dari huruf ke angka

    public void method1(String kalimat) {
        String[] huruf = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
        String[] angka = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        String[] kata = kalimat.split(" ");
        String hasil = "";

        for (int i = 0; i < kata.length; i++) {
            for (int j = 0; j < 12; j++) {
                if (huruf[j].equalsIgnoreCase(kata[i])) {
                    hasil = hasil + angka[j];
                } else if ("belas".equalsIgnoreCase(kata[i])) {
                    hasil = "1" + hasil;
                    break;
                } else if ("puluh".equalsIgnoreCase(kata[i]) && kata.length == (kata.length - 1)) {
                    hasil = hasil + "0";
                    break;
                } else if ("puluh".equalsIgnoreCase(kata[i])) {
                    break;
                } else if (huruf[j].equalsIgnoreCase(kata[i])) {
                    hasil = hasil.replaceAll("0", "");
                    hasil = hasil + angka[j];
                    break;
                } else if ("seratus".equalsIgnoreCase(kata[i])) {
                    hasil = "100";
                }
            }
        }
        System.out.println(hasil);
    }
}
