package soal2;

import java.util.Scanner;
public class Obat {
    private String Obat;
    private String NamaObat;
    private int HargaObat;
    public static void Obat(String[] pesanan, Obat[] obat) {
        System.out.println("____________________");
        System.out.println("Obat Yang Anda Pesan");
        System.out.println("____________________");
        int jmlh = 0;
        for (int a = 0; a < pesanan.length; a++) {
            for (int b = 0; b < obat.length; b++) {
                if (obat[b].getObat().equals(pesanan[a])) {
                    System.out.print(obat[b].getNamaObat());
                    System.out.print("Rp." + obat[b].getHargaObat());
                    jmlh = jmlh + obat[b].getHargaObat();
                    System.out.println("");
                }
            }
        }
        System.out.println("____________________");
        System.out.println("Total :   Rp." + jmlh);
    }
    public static Obat[] daftarObat(Obat[] obat) {
        String[] kodeObat = {"1", "2", "3", "4", "5"};
        String[] namaObat = {"Panadol   ", "Biogesic  ", "Lodia     ", "Decolsin  ", "Paramex   "};
        int[] harga = {2000, 4500, 1000, 3000, 5000};
        for (int a = 0; a < obat.length; a++) {
            obat[a] = new Obat();
            obat[a].setObat(kodeObat[a]);
            obat[a].setNamaObat(namaObat[a]);
            obat[a].setHargaObat(harga[a]);
        }
        return obat;
    }
    public static void cetakObat(Obat[] obat) {
        System.out.println("");
        System.out.println("_______________________________");
        System.out.println("          Daftar Obat");
        System.out.println("_______________________________");
        System.out.println("Kode\tNama\t\tHarga");
        for (int a = 0; a < obat.length; a++) {
            System.out.print(obat[a].getObat() + "\t");
            System.out.print(obat[a].getNamaObat() + "\t");
            System.out.printf("Rp." + obat[a].getHargaObat()+ "\n");
        }
    }
    public void setObat(String Obat) {
        this.Obat = Obat;
    }
    public void setNamaObat(String NamaObat) {
        this.NamaObat = NamaObat;
    }
    public void setHargaObat(int HargaObat) {
        this.HargaObat = HargaObat;
    }
    public String getObat() {
        return Obat;
    }
    public String getNamaObat() {
        return NamaObat;
    }
    public int getHargaObat() {
        return HargaObat;
    }
}
