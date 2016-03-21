package Laporanke3;
public class Apotik {
    private String nama, alamat;
    int total;
    public String[] obat = {"paramex", "neuremacil", "dextral", "bodrex", "decolgen", "paracetamol", "konidin", "reumacil", "promag", "entrostop"};
    public int[] harga = {2200, 1500, 3700, 2000, 1500, 1700, 2800, 1900, 1600, 5000};
    private String[] mun = new String [10];
    private int [] hargaku= new int [10];
    static int s;

    public Apotik(String Nama, String Alamat) {
        nama = Nama;
        alamat = Alamat;
        total = 0;
    }
    public void Apotik(String Nama) {
        nama = Nama;
        s = 0;
    }
    public void manggil() {
        for (int i = 0; i < obat.length; i++) {
            System.out.println(obat[i] + harga[i]);
        }
    }

    public void cobaapotik(String jenisobat) {
            if (jenisobat.equalsIgnoreCase("paramex")) {
                mun[s] = obat[0];
                hargaku[s]= harga [0];
                total = total + harga[0];
            } else if (jenisobat.equalsIgnoreCase("neuremacil")) {
                mun[s] = obat[1];
                 hargaku[s]= harga [1];
                total = total + harga[1];
            } else if (jenisobat.equalsIgnoreCase("dextral")) {
                mun[s] = obat[2];
                 hargaku[s]= harga [2];
                total = total + harga[2];
            } else if (jenisobat.equalsIgnoreCase("bodrex")) {
                mun[s] = obat[3];
                 hargaku[s]= harga [3];
                total = total + harga[3];
            } else if (jenisobat.equalsIgnoreCase("decolgen")) {
                mun[s] = obat[4];
                 hargaku[s]= harga [4];
                total = total + harga[4];
            } else if (jenisobat.equalsIgnoreCase("paracetamol")) {
                mun[s] = obat[5];
                 hargaku[s]= harga [5];
                total = total + harga[5];
            } else if (jenisobat.equalsIgnoreCase("konidin")) {
                mun[s] = obat[6];
                 hargaku[s]= harga [6];
                total = total + harga[6];
            } else if (jenisobat.equalsIgnoreCase("reumacil")) {
                mun[s] = obat[7];
                 hargaku[s]= harga [7];
                total = total + harga[7];
            } else if (jenisobat.equalsIgnoreCase("promag")) {
                mun[s] = obat[8];
                 hargaku[s]= harga [8];
                total = total + harga[8];
            } else if (jenisobat.equalsIgnoreCase("entrostop")) {
                mun[s] = obat[9];
                 hargaku[s]= harga [9];
                total = total + harga[9];
            }
        s++;
    }
    public void struk() {
        System.out.println("*SELAMAT DATANG DI APOTEK QIRIN*");
        System.out.println("Nama:" + nama);
        System.out.println("Alamat:" + alamat);
        for (int i = 0; i < s; i++) {
            System.out.println(mun[i]+" " + " "+hargaku[i]);
        }
        System.out.println("-----------------------+");
        System.out.println("Total Harga : " + "Rp. " + total);
        System.out.println("BARANG YANG SUDAH DEBELI TIDAK DAPAT DIKEMBALIKAN !!");
    }
}
