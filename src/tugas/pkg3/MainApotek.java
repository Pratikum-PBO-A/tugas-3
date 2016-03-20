package bab3;

import java.util.Scanner;

public class MainApotek {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tbelanja = 0, tsementara = 0;
        System.out.print("Data Konsumen");
        System.out.print("\nNama: ");
        String nama = scn.next();
        System.out.print("Alamat: ");
        String alm = scn.next();
        Apotek farma = new Apotek(nama, alm);
        Apotek kimia = new Apotek();
        while (true) {
            System.out.print("Masukkan pilihan obat: ");
            int pil = scn.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Jumlah pemesanan: ");
                    int jml1 = scn.nextInt();
                    kimia.Total(jml1, 5000);
                    break;
                case 2:
                    System.out.print("Jumlah pemesanan: ");
                    int jml2 = scn.nextInt();
                    kimia.Total(jml2, 6000);
                    break;
                case 3:
                    System.out.print("Jumlah pemesanan: ");
                    int jml3 = scn.nextInt();
                    kimia.Total(jml3, 8000);
                    break;
            }
            System.out.print("Tambah obat lagi? (Y/N) : ");
            String lagi = scn.next();
            System.out.println("-----------------------------");
            if (lagi.equalsIgnoreCase("Y")) {
                continue;
            } else if (lagi.equalsIgnoreCase("N")) {
                System.out.print("Yang harus dibayar = Rp " + kimia.getTbelanja());
                System.out.print("\nUang Anda = Rp ");
                int bayar = scn.nextInt();
                kimia.Total(bayar);
                System.out.print("Kembalian Anda = Rp " + kimia.getKembalian());
                break;
            }
        }
    }
}
