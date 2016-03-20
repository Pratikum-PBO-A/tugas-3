package oop;

import java.util.Scanner;
public class mainApotek {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int pilih;
        System.out.println("masukan data diri anda :");
        System.out.print("masukan nama anda : ");
        String nama = sc2.nextLine();
        System.out.print("masukan alamat anda : ");
        String alamat = sc2.nextLine();
        apotek apt = new apotek(nama, alamat);
        do {
            System.out.println("1. Transaksi");
            System.out.println("2. Melihat data diri anda");
            System.out.println("3. Selesai");
            System.out.print("Masukan pilihan anda :");
            pilih = sc.nextInt();
            if (pilih == 1 || pilih == 3) {
                apotek apk = new apotek(pilih);
            } else if (pilih == 2) {
                apt.display();
            } else {
                System.out.println("program tidak ditemukan");
            }
        } while (pilih != 3);
    }
}
