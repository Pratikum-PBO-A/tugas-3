package prakpbo;
import java.util.Scanner;
public class bilanganmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, plh;
        String huruf;
        bilangan X = new bilangan();
        do {
            System.out.println("Pilih konversi");
            System.out.println("1.Angka ke huruf");
            System.out.println("2.Huruf ke angka");
            System.out.println();
            System.out.print("Pilihan Anda : ");
            plh = input.nextInt();
        } while (plh > 2 || plh == 0);
        switch (plh) {
            case 1:
                System.out.println("Interval Angka (0-100)");
                System.out.print("Masukkan angka = ");
                angka = input.nextInt();
                X.konversi(angka);
                break;
            case 2:
                System.out.println("Interval Angka(0-100)");
                System.out.print("Masukkan angka dalam huruf = ");
                huruf = input.nextLine();
                huruf = input.nextLine();
                System.out.println("Hasil = " + X.konversi2(huruf.toLowerCase()));
                break;
        }
    }
}