package praktikum3;

import java.util.Scanner;

public class konfersiIntString {

    private String huruf;
    private int angka;
    Scanner scan = new Scanner(System.in);
    Scanner scan2 = new Scanner(System.in);

    public void setAngka(int angka) {
        System.out.print("Masukkan angka : ");
        angka = scan.nextInt();
        this.angka = angka;
    }

    public void setHuruf(String huruf) {
        System.out.print("Masukkan huruf terbilang : ");
        huruf = scan2.nextLine();
        this.huruf = huruf;
    }

    public int getAngka() {
        return angka;
    }

    public String getHuruf() {
        return huruf;
    }

    public String overloadingMeth(int angka) {
        String[] arrayangka = {"Nol", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sebilan", "Sepuluh", "Sebelas"};
        String output = "";
        if (angka < 12) {
            output = arrayangka[angka];
        } else if (angka == 20
                || angka == 30
                || angka == 40
                || angka == 50
                || angka == 60
                || angka == 70
                || angka == 80
                || angka == 90) {
            output = arrayangka[angka / 10] + " Puluh";
        } else if (angka < 20) {
            output = arrayangka[angka - 10] + " Belas";
        } else if (angka < 100) {
            output = arrayangka[angka / 10] + " Puluh " + arrayangka[angka % 10];
        } else if (angka == 100) {
            output = "Seratus";
        }
        return output;
    }

    public int overloadingMeth(String angka) {
        int output = 0;
        String konv1 = "", konvCetak = "";
        String[] arraybil = angka.split(" ");
        for (int x = 0; x < arraybil.length; x++) {
            if (arraybil[x].equals("nol")) {
                konv1 = "0";
            } else if (arraybil[x].equals("satu")) {
                konv1 = "1";
            } else if (arraybil[x].equals("dua")) {
                konv1 = "2";
            } else if (arraybil[x].equals("tiga")) {
                konv1 = "3";
            } else if (arraybil[x].equals("empat")) {
                konv1 = "4";
            } else if (arraybil[x].equals("lima")) {
                konv1 = "5";
            } else if (arraybil[x].equals("enam")) {
                konv1 = "6";
            } else if (arraybil[x].equals("tujuh")) {
                konv1 = "7";
            } else if (arraybil[x].equals("delapan")) {
                konv1 = "8";
            } else if (arraybil[x].equals("sembilan")) {
                konv1 = "9";
            } else if (arraybil[x].equals("sepuluh")) {
                konv1 = "10";
            } else if (arraybil[x].equals("sebelas")) {
                konv1 = "11";
            } else if (arraybil[x].equals("belas")) {
                konv1 = "1";
            } else if (arraybil[x].equals("seratus")) {
                konv1 = "100";
            } else {
                konv1 = "";
            }

            if (arraybil[x].equals("puluh")) {
                if (arraybil.length == 2) {
                    konvCetak = konvCetak + "0";
                } else {
                    konvCetak = konvCetak + konv1;
                }
            } else if (arraybil[x].equals("belas")) {
                konvCetak = konv1 + konvCetak;
            } else {
                konvCetak = konvCetak + konv1;
            }
        }
        output = Integer.parseInt(konvCetak);
        return output;
    }
}
