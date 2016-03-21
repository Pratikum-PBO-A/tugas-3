package praktikum3;

import java.util.Scanner;

public class MainKonversi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        konfersiIntString konv = new konfersiIntString();
        int pilih = 0;
        while (pilih != 3) {
            System.out.println("Menu Konversi");
            System.out.println("1. Angka -> Huruf Terbilang");
            System.out.println("2. Huruf Terbilang -> Angka");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    konv.setAngka(0);
                    System.out.println((konv.overloadingMeth(konv.getAngka())));
                    System.out.println("");
                    break;
                case 2:
                    konv.setHuruf("");
                    System.out.println((konv.overloadingMeth(konv.getHuruf())));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Program konversi berahir");
                    break;
                default:
                    System.out.println("Apa Tugas anda Menumpuk?");
                    System.out.println("Mungkin anda Lelah");
                    System.out.println("Pilihan anda ngelantur");
                    System.out.println("");
            }
        }

    }

}
