package TugasPraktikum;
import java.io.*;
import java.util.Scanner;

public class MainOverloadingFunction {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        OverloadingFunction konversi = new OverloadingFunction();
        System.out.println("======================================================");
        System.out.println("                   PROGRAM KONVERSI                   ");
        System.out.println("======================================================");
        System.out.println("Range dari 0-100");
        System.out.println("");
        System.out.println("KONVERSI DARI ANGKA KE HURUF");
        System.out.print("Masukkan angka : ");
        int satuan = in.nextInt();
        System.out.print("Hasil Konversi Angka : ");
        konversi.method1(satuan);
        System.out.println("");
        System.out.println("KONVERSI DARI HURUF KE ANGKA");
        System.out.print("Masukkan huruf : ");
        String huruf = input.readLine();
        System.out.print("Hasil Konversi Huruf : ");
        konversi.method1(huruf);
    }
}