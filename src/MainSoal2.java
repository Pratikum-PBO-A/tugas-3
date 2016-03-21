package Bab3;
import java.util.Scanner;
public class MainSoal2{
public static void main(String[] args) {
        String cek;
        int hrg, jml, total;
        String nama, alamat;
        System.out.println("==Selamat Datang di Apotik Kita==");
        System.out.println("Panadol \t3000 ");
        System.out.println("Bodrex \t\t1500");
        System.out.println("Promag \t\t10000");
        System.out.println("Insana \t\t7000");
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        System.out.print("Nama : ");
        nama = in.next();
        System.out.print("Alamat : ");
        alamat = in2.next();
        Soal2 pembeli = new Soal2(nama, alamat);
        Soal2 obat = new Soal2(); 
        do{
        System.out.print("Pilih Obat : ");
        String ob = in.next();
        System.out.print("Jumlah : ");
        jml = in.nextInt();
        obat.drugstore(ob,jml);
        System.out.print("Beli lagi (Y/N): ");
           cek = in.next();
        }while(cek.equalsIgnoreCase("y")); System.out.println("==================================");
        obat.drugstore();
        System.out.println("Semoga Sehat Selalu");
     System.out.println("==================================");
        
    }
}
