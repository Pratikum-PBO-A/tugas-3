
package apotik;
import java.util.Scanner;
public class mainApotik {
 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pilih;
        System.out.print("Masukkan Nama  : ");
        String a = s.nextLine();
        System.out.print("Masukkan kode:");
        String l = s.nextLine();
        String obat;
        Apotik main = new Apotik( a,l);
        do {
            System.out.println("Daftar Obat Yang tersedia");
            System.out.println("============================");
            System.out.println(" -Paracetamol \t -konidin\n -neuremacil \t -bodrek \n -Amoxilin\t -decolgen \t -promag \n -entrostop \t -alpara");
            System.out.print("Masukkan Nama Obat:");
            obat = s.nextLine();
            main.cobaapotik(obat);
            System.out.println("Tambah lagi : Y/N");
            pilih = s.nextLine();
        } while ("y".equalsIgnoreCase(pilih));
        main.NotaPembelian();
    }
}


