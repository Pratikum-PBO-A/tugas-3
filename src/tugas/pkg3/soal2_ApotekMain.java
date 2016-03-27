package tugas.pkg3;
import java.util.Scanner;
public class soal2_ApotekMain {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String name, address, a = "y", b;
        int pil, no, jumlah;
        System.out.print("Masukkan Nama Anda\t: ");
        name = input.next();
        System.out.print("Masukkan Alamat Anda\t: ");
        address = input.next();
        soal2_Apotek obat = new soal2_Apotek();
        soal2_Apotek user = new soal2_Apotek(name, address);
        System.out.println("\t\tDaftar Obat");
        System.out.println("No.\tNama Obat\t\tHarga");
        System.out.println("1.\tParacetamol\t\t" + obat.harga[0]);
        System.out.println("2.\tParamex\t\t\t" + obat.harga[1]);
        System.out.println("3.\tPromag\t\t\t" + obat.harga[2]);
        System.out.println("");
        do {
            System.out.print("Pilih Obat: ");
            pil = input.nextInt();
            switch (pil){
                case 1 : 
                    System.out.print("Masukkan jumlah obat : ");
                    jumlah = input.nextInt();
                    user.jumlah(jumlah);
                    user.price1();
                break;
                case 2: 
                    System.out.print("Masukkan jumlah obat : ");
                    jumlah = input.nextInt();
                    user.jumlah(jumlah);
                    user.price2();
                break;
                case 3 :
                    System.out.print("Masukkan jumlah obat : ");
                    jumlah = input.nextInt();
                    user.jumlah(jumlah);
                    user.price3();
                break;
                default :
                    System.out.println("Kode yang anda masukkan salah!");
            }
            System.out.print("Tambah obat ? (y/n) : ");
            b = input.next();
            System.out.println("");
        } while (a.equalsIgnoreCase(b));
        user.jumlah();
        user.display();
    }
}
