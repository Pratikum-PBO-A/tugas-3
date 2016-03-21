package javaapplication68;
import java.util.Scanner;
public class MainApotik {
   public static void main(String[] args) {
        Apotik apotek = new Apotik();
        Byte pil,pilObat,blLg;
        String data[]={"",""};
        Scanner input = new Scanner (System.in); 
        System.out.println("APOTEK SEHAT DUNIA AKHIRAT");
        System.out.println("==========================");
        System.out.println("");
        System.out.println("Isilah Data Diri Anda");
        System.out.print("Nama : ");
        data[0]=input.nextLine();
        System.out.print("Alamat : ");
        data[1]=input.nextLine();
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1.Daftar Obat");
        System.out.println("2.Beli Obat");
        System.out.println("3.Selesai, lihat total harga");
        do {
            System.out.println("");
            System.out.print("Pilih Menu: ");
            pil = input.nextByte();
            if (pil==1) {
                apotek.obat();
            }else if(pil==2){
                do {
                System.out.print("masukkan nomor obat yang ingin dibeli : ");
                    pilObat = input.nextByte();
                    apotek.obat(pilObat);
                   System.out.print("beli lagi(1.ya 2.tidak)? ");
                    blLg = input.nextByte();
                } while (blLg!=2);
            }else if(pil==3){
                System.out.println("Nama : "+data[0]);
                System.out.println("Alamat : "+data[1]);
                System.out.println("Anda telah membeli "+apotek.totalJenisObat);
                System.out.println("Dengan total harga "+apotek.hargaTotal);
            }else{
                System.out.println("Maaf, Menu Tidak Tersedia");
            }
        } while (pil!=3);
    }
}
