/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanapotek;

/**
 *
 * @author Bachtiar
 */
import java.util.Scanner;

public class PenjualanApotek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        databaseapotek apt = new databaseapotek();
        int ulang = -1;
        System.out.println("\t\t\tProgram Penjualan Apotek\n"
                + "\t\tSelamat Datang Di Apotek Seger Waras\n"
                + "\t\t\tSilahkan Berbelanja\n");
        System.out.print("Nama Anda\t: ");
        String nama = a.nextLine();
        apt.setNama(nama);
        System.out.print("Alamat\t\t: ");
        String alamat = a.next();
        apt.setAlamat(alamat);
        apt.setPetugas("Rizky Bachtiar");
        System.out.println();
        do {
            System.out.println("\t1. Amoxilin\t15000\n"
                    + "\t2. Amoxan\t 12000\n"
                    + "\t3. Oskadon\t 5000\n"
                    + "\t4. Vaksin\t 14000\n"
                    + "\t5. Panadol\t 2000\n"
                    + "\t6. Mixagrip\t1500\n"
                    + "\t7. Sanaflu\t3000\n");
            System.out.println();
            System.out.print("Pilih apa ?\t: ");
            int pilih = a.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Anda membeli Amoxilin dengan harga Rp 15000,-");
                    int harga1 = 15000;
                    System.out.print("Dengan jumlah\t: ");
                    int total1 = a.nextInt();
                    int bayar1 = harga1 * total1;
                    System.out.println("Total\t: " + bayar1);
                    apt.setTotal(apt.getBayar());
                    break;
                case 2:
                    System.out.println("Anda membeli Amoxan dengan harga Rp 12000,-");
                    int harga2 = 12000;
                    System.out.print("Dengan jumlah\t: ");
                    int total2 = a.nextInt();
                    int bayar2 = harga2 * total2;
                    System.out.println("Total\t: " + bayar2);
                    apt.setTotal(apt.getBayar());
                    break;
                case 3:
                    System.out.println("Anda membeli Oskadon dengan harga Rp 5000,-");
                    int harga3 = 5000;
                    System.out.print("Dengan jumlah\t: ");
                    int total3 = a.nextInt();
                    int bayar3 = harga3 * total3;
                    System.out.println("Total\t: " + bayar3);
                    apt.setTotal(apt.getBayar());
                    break;
                case 4:
                    System.out.println("Anda membeli Vaksin dengan harga Rp 14000,-");
                    int harga4 = 14000;
                    System.out.print("Dengan jumlah\t: ");
                    int total4 = a.nextInt();
                    int bayar4 = harga4 * total4;
                    System.out.println("Total\t: " + bayar4);
                    apt.setTotal(apt.getBayar());
                    break;
                case 5:
                    System.out.println("Anda membeli Panadol dengan harga Rp 2000,-");
                    int harga5 = 2000;
                    System.out.print("Dengan jumlah\t: ");
                    int total5 = a.nextInt();
                    int bayar5 = harga5 * total5;
                    System.out.println("Total\t: " + bayar5);
                    apt.setTotal(apt.getBayar());
                    break;
                case 6:
                    System.out.println("Anda membeli Mixagrip dengan harga Rp 1500,-");
                    int harga6 = 1500;
                    System.out.print("Dengan jumlah\t: ");
                    int total6 = a.nextInt();
                    int bayar6 = harga6 * total6;
                    System.out.println("Total\t: " + bayar6);
                    apt.setTotal(apt.getBayar());
                    break;
                case 7:
                    System.out.println("Anda membeli Sanaflu dengan harga Rp 3000,-");
                    int harga7 = 3000;
                    System.out.print("Dengan jumlah\t: ");
                    int total7 = a.nextInt();
                    int bayar7 = harga7 * total7;
                    System.out.println("Total\t: " + bayar7);
                    apt.setTotal(apt.getBayar());
                    break;
                default:
            }
            System.out.println("Ulangi Lagi ?\t: ");
            System.out.println("\t1. Iya\n\t2. Tidak");
            System.out.print("Pilih\t: ");
            ulang = a.nextInt();
        } while (ulang == 1);
        apt.NamaAlamat();
        System.out.print("Total semua menjadi Rp ");
        apt.showBayar();

    }
}
