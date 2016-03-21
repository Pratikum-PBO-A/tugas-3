package soal2;

import soal2.data;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------");
        System.out.println("APOTEK TAHES");
        System.out.println("------------");
        Scanner scan = new Scanner(System.in);
        String[] pesanan = new String[100];
        Obat[] obat = new Obat[5];
        data user = new data();
        int x = 0;
        user.setNama();
        user.setAlamat();
        obat = Obat.daftarObat(obat);
        Obat.cetakObat(obat);
        System.out.println("Jika selesai masukkan '0'");
        do {
            System.out.print("KODE OBAT  : ");
            pesanan[x] = scan.next();
            if (pesanan[x].equals("0")) {
                pesanan[x] = "";
                break;
            } else {
                x++;
            }
        } while (1 > 0);
        System.out.println("");
        Obat.Obat(pesanan, obat);
    }
    
}
