package Bab3;
import java.util.Scanner;
public class MainSoal1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Soal1 konv = new Soal1();
        int pilih = 0;
        while (pilih != 3) {
            System.out.println("Menu Konversi");
            System.out.println("1. Angka-Huruf");
            System.out.println("2. Huruf-Angka");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    konv.setAngka(0);
                    System.out.println((konv.overloadingMeth(konv.getAngka())));
                    System.out.println("");
                    break;
                case 2:
                    konv.setHuruf("");                   
                    System.out.println((konv.overloadingMeth(konv.getHuruf())));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Program konversi berahir");
                    break;
                default:
                    System.out.println("Anda Salah Pilih");
                    
            }
        }

    }

}
