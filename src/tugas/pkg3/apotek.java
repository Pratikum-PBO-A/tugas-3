package oop;
import java.util.Scanner;
public class apotek {
    private String nama, alamat;
    private String obat[][] = {
        {"Promag", "1", "1000"},
        {"Panadol", "2", "2000"},
        {"OBH", "3", "1500"},
        {"Stimuno", "4", "4000"}
    };
    private int total = 0, pilih = 0, kode = 0, totbar = 0, totalharga = 0;
    private Scanner sc = new Scanner(System.in);
    public apotek(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    public apotek(int pilih) {
        if (pilih == 1) {
            do {
                System.out.println("Daftar obat yang dijual");
                System.out.println("Nama Barang   \tKode       \tHarga");
                for (int i = 0; i < obat.length; i++) {
                    for (int j = 0; j < obat[i].length; j++) {
                        System.out.print(obat[i][j]);
                        System.out.print("        \t");
                    }
                    System.out.println(" ");
                }
                System.out.println("pilihan : ");
                System.out.println("1. Transaksi");
                System.out.println("2. Selesai");
                System.out.print("Pilih : ");
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("Masukan kode barang : ");
                        kode = sc.nextInt();
                        System.out.print("Masukan Banyaknya Barang : ");
                        int bar = sc.nextInt();
                        totbar = totbar + bar;
                        if (kode == 1) {
                            int a = Integer.parseInt(obat[0][2]);
                            total = bar * a;
                        } else if (kode == 2) {
                            int a = Integer.parseInt(obat[1][2]);
                            total = bar * a;
                        } else if (kode == 3) {
                            int a = Integer.parseInt(obat[2][2]);
                            total = bar * a;
                        } else if (kode == 4) {
                            int a = Integer.parseInt(obat[3][2]);
                            total = bar * a;
                        } else {
                            System.out.println("Barang tidak tersedia...");
                        }
                        System.out.println("Total : Rp" + total);
                        totalharga += total;
                        System.out.println("----------------------------------");
                        break;
                    case 2:
                        System.out.println("Terimaksih semoga lekas sembuh ");
                        System.out.println("----------------------------------");
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");

                }
                display(totalharga);
            } while (pilih != 2);
        } else if (pilih == 3) {
            System.out.println("program berhenti");
        }
    }
    public void display() {
        System.out.println("Nama Anda " + nama);
        System.out.println("Alamat anda " + alamat);
    }
    public void display(int totalharga) {
        System.out.println("Total belanja anda = Rp" + totalharga);
        System.out.println("----------------------------------");
    }
}
