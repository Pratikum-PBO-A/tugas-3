package TugasPraktikum;

import java.util.Scanner;

public class MainApotek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClassApotek hasil = new ClassApotek();
        int hargaBarang = 0;

        hasil.masuk();
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Tempat tinggal : ");
        String alamat = input.nextLine();
        System.out.print("Umur : ");
        String umur = input.nextLine();
        hasil.obat();
        System.out.print("Pilihan : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            hargaBarang = 15000;
            System.out.println("OBH batuk berdahak :Rp. " + hargaBarang);
        } else if (pilihan == 2) {
            hargaBarang = 3000;
            System.out.println("Paramex :Rp. " + hargaBarang);
        } else if (pilihan == 3) {
            hargaBarang = 5000;
            System.out.println("Antibiotik :Rp. " + hargaBarang);
        } else if (pilihan == 4) {
            hargaBarang = 12000;
            System.out.println("Termorex+ :Rp. " + hargaBarang);
        } else if (pilihan == 5) {
            hargaBarang = 10000;
            System.out.println("Dulcolax :Rp. " + hargaBarang);
        } else {
            System.out.println("MAAF KAMI TIDAK MEMPUNYAI OBAT YANG ANDA BUTUHKAN...");
        }
        System.out.println("=====================================");
        System.out.println("Total :Rp. " + (int) hargaBarang);
        System.out.print("Bayar :Rp. ");
        int bayar = input.nextInt();
        hasil.kembali(bayar, hargaBarang);
        System.out.println();
        System.out.println("TERIMA KASIH SUDAH MEMBELI OBAT DI APOTEK BUNGA...");
        System.out.println("SEMOGA LEKAS SEMBUH");
    }
}