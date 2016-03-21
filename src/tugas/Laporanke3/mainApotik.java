package Laporanke3;
import java.util.Scanner;
public class mainApotik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pilih;
        System.out.print("Masukkan Nama Anda  : ");
        String a = in.nextLine();
        System.out.print("Masukkan Alamat Anda :");
        String l = in.nextLine();
        String obat;
        Apotik mini = new Apotik(a, l);
        do {
            System.out.println("------- DAFTRA PILIHAN OBAT ----------");
            System.out.println(" *Obat yang Tersedia*");
            System.out.println(" -KONIDIN \t -PARAMEX\n -BODREX\t -NEUREMACIL \n -DELKOGEN \t -PARACETAMOL \n -PROMAG \t -REUMACIL \n -ENTROSTOP \t -DEXTRAL");
            System.out.print("Masukkan Nama Obat:");
            obat = in.nextLine();
            mini.cobaapotik(obat);
            System.out.println("Tambah lagi : Y/N");
            pilih = in.nextLine();
        } while ("y".equalsIgnoreCase(pilih));
        mini.struk();

    }
}
