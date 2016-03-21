package Modul1_Bab3;
/**
 *
 * @author abdu_
 */
 import java.util.Scanner;
public class MainKonversiBil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KonversiBil x = new KonversiBil();
        String i = "Y";
        do {
            System.out.println("\t======== PROGRAM KONVERSI BILANGAN ========");
            System.out.print("Masukkan angka (0-100)   \t: ");
            x.overloadingMethod(in.nextInt());
            //Angka int diconvert ke bilangan String
            System.out.println("Hasil konversi \t\t\t: " + x.x);
            System.out.print("Masukkan Bilangan (nol-seratus) : ");
            x.overloadingMethod(inputString());
            System.out.print("Hasil konversi \t\t\t: ");
            //Bilangan String diconvert ke Angka int
            if (x.y >= 0 && x.y <= 100) {
                System.out.println(x.y);
            } else if (x.y == 1000) {
                System.out.println("Sepertinya Anda typo");
            } else {
                System.out.println("Bilangan diluar range (nol-seratus)!");
            }
            System.out.print("\nMasukkan Huruf \"Y\" Untuk Mengulangi Lagi ? ");
            i = in.next();
            System.out.println("");

        } while (i.equalsIgnoreCase("Y"));
        System.err.println("Program dihentikan");
    }

    static String inputString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}