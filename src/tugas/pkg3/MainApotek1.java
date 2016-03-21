package TugasPraktikum;

import java.util.Scanner;

public class MainApotek1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        String nama, alamat;
        int pilih = 0, Duit, pil, q, w;
        System.out.println("===============================");
        System.out.println(" Selamat Datang di Apotek PTI");
        System.out.println("===============================");
        System.out.print("Masukkan nama anda   : ");
        nama = inputStr.nextLine();
        System.out.print("Masukkan alamat anda : ");
        alamat = inputStr.nextLine();
        System.out.println("===============================");
        System.out.println();
        ClassApotek1 user = new ClassApotek1(nama, alamat);
        while (pilih != 4) {
            System.out.println("================================");
            System.out.println("1. Pesan obat");
            System.out.println("2. Lihat pesanan obat");
            System.out.println("3. Bayar");
            System.out.println("4. Selesai");
            System.out.println("================================");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    user.displayDaftar();
                    System.out.print("Silahkan Pilih obat yang anda pesan : ");
                    pil = input.nextInt();
                    q = pil - 1;
                    System.out.print("Jumlah pcs yang di pesan : ");
                    w = input.nextInt();
                    user.Membayar(q, w);
                    System.out.println();
                    break;
                case 2:
                    user.displayPesanan();
                    break;
                case 3:
                    System.out.println("===============================================");
                    System.out.println("Pelanggan atas nama " + user.getNama());
                    System.out.println("Yang bertempat tinggal di " + user.getAlamat());
                    System.out.println("===============================================");
                    user.displayPesanan();
                    System.out.println("===============================================");
                    System.out.println("Obat yang harus anda bayarkan : " + user.TotalBayar());
                    System.out.print("Jumlah Uang yang dibayarkan         : ");
                    Duit = input.nextInt();
                    user.UangKembalian(Duit);
                    break;
                case 4:
                    System.out.println("Anda telah keluar dari progam");
                    break;
                default:
                    System.out.println("Input yang anda masukkan salah!!!");
                    break;
            }
        }
    }
}