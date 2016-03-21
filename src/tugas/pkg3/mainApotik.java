package Modul1_Bab3;
/**
 *
 * @author abdu_
 */
import java.util.Scanner;
public class mainApotik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, alamat;
        int jml, kode;
        Obat[] daftar;
        System.out.print("Nama\t: ");
        nama = in.nextLine();
        System.out.print("Alamat\t: ");
        alamat = in.nextLine();
        Costumers c1 = new Costumers(nama, alamat);
        c1.display("Daftar Obat");
        System.out.print("Jumlah obat yang dipilih : ");
        jml = in.nextInt();
        daftar = new Obat[jml];
        for (int i = 0; i < daftar.length; i++) {
            System.out.printf("Masukkan kode obat %d : ", (i + 1));
            kode = in.nextInt();
            daftar[i] = new Obat(kode);
        }
        System.out.println("");
        Costumers c2 = new Costumers(nama, alamat, daftar);
        c2.display();
    }
}
