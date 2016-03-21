package praktikum3;

import java.util.Scanner;

public class mainApotik {

    public static void main(String[] args) {
        String cek;
        int hrg, jml, total;
        String nama, alamat;
        System.out.println("==Selamat Datang di Apotik Tahes Sam==");
        System.out.println("Konidin \t5000 ");
        System.out.println("Mixagrip \t15000");
        System.out.println("Promag \t\t10000");
        System.out.println("Insana \t\t7000");
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Nama : ");
        nama = in.next();
        System.out.print("Alamat : ");
        alamat = in2.nextLine();
        Apotik pembeli = new Apotik(nama, alamat);
        Apotik obat = new Apotik();
        do {
            System.out.print("Pilih Obat : ");
            String ob = in2.next();
            System.out.print("Jumlah : ");
            jml = in.nextInt();
            obat.drugstore(ob, jml);
            System.out.print("Beli lagi (Y/N): ");
            cek = in.next();

        } while (cek.equalsIgnoreCase("y"));
        System.out.println("==================================");
        obat.drugstore();
        System.out.println("Semoga tahes selalu");
        System.out.println("==================================");

    }
}
