package bab3;
import java.util.Scanner;
public class mainAngka {
    public static void main(String[] args) {       
        Scanner input = new Scanner(System.in);
        angka convert = new angka();
        int pil = 0;
        do {
            System.out.println("1)CONVERT ANGKA KE HURUF. \n2)CONVERT HURUF KE ANGKA. \n3)KELUAR.");   
            System.out.print("MASUKKAN PILIHAN (1/2) : ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("MASUKKAN ANGKA (1-100): ");
                    int angka = input.nextInt();
                    convert.overloadingMeth(angka);
                    break;
                case 2:
                    System.out.println("MASUKKAN HURUF YANG AKAN DI CONVERT (SATU-SERATUS): ");
                    input.nextLine();
                    String huruf = input.nextLine();
                    convert.overloadingMeth(huruf);
                    break;
            }
        } while (pil < 3);
    }
}
