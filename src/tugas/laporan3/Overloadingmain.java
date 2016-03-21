/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laporan3;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Overloadingmain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka, pil;
        String huruf;
        Overloading over = new Overloading();
        do {
            System.out.println("PILIHAN KONVERSI ANGKA");
            System.out.println("======================");
            System.out.println("1.Angka ke huruf");
            System.out.println("2.Huruf ke angka");
            System.out.println();
            System.out.print("Masukkan Pilihan Anda : ");
            pil = input.nextInt();
        } while (pil > 2 || pil == 0);
        switch (pil) {
            case 1:
                System.out.println("Range Angka (0-100)");
                System.out.print("Masukan angka = ");
                angka = input.nextInt();
                over.AngkakeHuruf(angka);
                break;
            case 2:
                System.out.println("Range Angka(0-100)");
                System.out.print("Masukkan dalam bentuk huruf = ");
                huruf = input.nextLine();
                huruf = input.nextLine();
                System.out.println("Hasil = " + over.HurufkeAngka(huruf.toLowerCase()));
                break;
        }
    }
}

