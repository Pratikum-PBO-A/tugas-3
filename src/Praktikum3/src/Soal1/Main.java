package Soal1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Convertor conv = new Convertor();
        String loop = "y";
        do {
            cetakMenu();
            switch (scan.next()) {
                case "0":
                    System.out.println("Program selesai");
                    loop = "n";
                    break;
                case "1":
                    System.out.print("Masukkan angka : ");
                    conv.setBilangan(scan.nextInt());
                    conv.cetak(conv.overloadingMeth(conv.getBilangan()));
                    System.out.println("");
                    break;
                case "2":
                    System.out.print("Masukkan terbilang : ");
                    conv.setTerbilang(scan2.nextLine());
                    conv.cetak(conv.overloadingMeth(conv.getTerbilang()));
                    System.out.println("");
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    System.out.println("");
                    break;
            }
        } while (loop == "y");

    }

    public static void cetakMenu() {
        System.out.println("PILIH MASUKAN");
        System.out.println("1. Angka -> Terbilang");
        System.out.println("2. Terbilang -> Angka");
        System.out.println("0. Keluar");
        System.out.print("pilih : ");
    }

}
