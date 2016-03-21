package tugas.pkg3;
import java.util.Scanner;
public class soal1_Main {
    public static void main(String[] args) {
        soal1 rubah = new soal1();
        int pilihan, pilih, masukan;
        Scanner in = new Scanner(System.in);
        Scanner out = new Scanner(System.in);
        Scanner inout = new Scanner(System.in);
        do {
            System.out.println("");
            System.out.println("=================");
            System.out.println("Pilihan Perubahan(rentang 0-99)");
            System.out.println("1.Angka ke Huruf");
            System.out.println("2.Huruf ke Angka");
            System.out.println("3.Exit");
            System.out.print("Masukan pilihan : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukan Angka yang ingin dirubah : ");
                    int angka1 = in.nextInt();
                    rubah.overloading(angka1);
                    break;
                case 2:
                    System.out.println("1.Dalam satuan");
                    System.out.println("2.Dalam puluhan");
                    System.out.print("Masukan Pilihan : ");
                    pilih = inout.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.print("Masukan Huruf yang ingin dirubah : ");
                            String huruf2 = out.nextLine();
                            rubah.Overloading(huruf2);
                            break;
                        case 2:
                            System.out.print("Masukan Huruf yang ingin dirubah : ");
                            String huruf1 = out.nextLine();
                            rubah.Overloading(huruf1);
                            break;
                    }
                default:
                    System.out.println("Terima Kasih");
            }
        } while (pilihan != 3);
    }
}
