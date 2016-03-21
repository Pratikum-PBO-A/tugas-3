package Bab3;
import java.util.Scanner;
public class mainApotek {
    public static void main(String[] args) {
        String Obat;
        String nama;
        String alamat;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan Nama Pelangan : ");
        nama = in.nextLine();
        System.out.print("Masukan Alamat Pelangan : ");
        alamat = in.nextLine();
        apotek a = new apotek (nama, alamat);
        a.DaftarObat();
        do{
            System.out.print("Nama obat yang mau di beli : ");
            Obat =in.nextLine();
            a.pesamObat(Obat);
        }while ((!(Obat.equalsIgnoreCase("stop"))));
        a.totalharga();
    }
}
