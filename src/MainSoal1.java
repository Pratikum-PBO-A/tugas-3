package Bab3;
import java.util.Scanner;

public class MainSoal1 {
    public static void main(String[] args) {
	Scanner albert = new Scanner(System.in);
	
        System.out.println("============================== \n     > Program Konversi < \n==============================");
        System.out.println("Pilihan: \n 1.Angka ke Huruf \n 2.Huruf ke Angka \n==============================");
        System.out.print("Masukan Pilihan : ");
        int pilihan = albert.nextInt();
        
            if(pilihan == 1){
                System.out.println("==============================");
                System.out.print("Masukkan Angka[0-100] : ");
                System.out.println(new Soal1().overloadingMeth(albert.nextInt()));
                System.out.println("==============================");

            }
            else if(pilihan == 2){
                System.out.println("==============================");
                System.out.print("Masukkan Huruf[Nol-Seratus] : ");
                System.out.println(new Soal1().overloadingMeth(albert.nextInt()));
                System.out.println("==============================");
            }
            else
                System.out.println("Anda Salah Pilih ^^,");
    }
}
