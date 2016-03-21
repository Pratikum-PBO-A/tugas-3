/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpraktikum3;


 public class Obat {
  private String KodeObat;
  private String NamaObat;
  private int HargaObat;
  public void setKodeObat(String KodeObat) {
    this.KodeObat = KodeObat;
  }
  public void setNamaObat(String NamaObat) {
    this.NamaObat = NamaObat;
  }
  public void setHargaObat(int HargaObat) {
    this.HargaObat = HargaObat;
  }
  public String getKodeObat() {
    return KodeObat;
  }
  public String getNamaObat() {
    return NamaObat;
  }
  public int getHargaObat() {
    return HargaObat;
  }
  
  public static Obat[] daftarObat(Obat[] obat) {
    String[] kodeObat = {"B1", "B2", "B3", "B4", "B5","B6"};
    String[] namaObat = {"Parasetamol", "Amoxicilin", 
    "Flufenasin", "Heparin  ", "Aminophilin","Paramex   "};
    int[] hargaObat = {10000, 15000, 20000, 25000, 30000,5000};
    for (int x = 0; x < obat.length; x++) {
      obat[x] = new Obat();
      obat[x].setKodeObat(kodeObat[x]);
      obat[x].setNamaObat(namaObat[x]);
      obat[x].setHargaObat(hargaObat[x]);
    }
    return obat;
  } 
  public static void cetakDaftarObat(Obat[] obat) {
    System.out.println("Daftar Obat");
    System.out.println("Kode\tNama\tHarga");
    for (int x = 0; x < obat.length; x++) {
      System.out.print(obat[x].getKodeObat() + "\t");
      System.out.print(obat[x].getNamaObat() + "\t");
      System.out.print("Rp. " + obat[x].getHargaObat() + ",-" + "\n");
    }
  }
  public static void pesananObat(String[] pesanan, Obat[] obat)   
  {
    System.out.println("\nPesanan Obat");
    int total = 0;
    for (int x = 0; x < pesanan.length; x++) {
      for (int y = 0; y < obat.length; y++) {
        if (obat[y].getKodeObat().equals(pesanan[x])) {
          System.out.print(obat[y].getNamaObat() + " - ");
          System.out.print("Rp." + obat[y].getHargaObat() + " ,- ");
          
          total = total + obat[y].getHargaObat();
          System.out.println("");
        }
      }
    }
    System.out.println("------------");
    System.out.println("Total = Rp." + total + ",-");
  }
  public static void pesananObat(String[] pesanan, Obat[] obat, 
  Pelanggan  pel) {
    int total = 0;
    System.out.println("APOTEK JAYA MAKMUR");
    System.out.println("------------");
    System.out.println("a.n Saudara/Saudari : "+pel.getNama());
    System.out.println("Alamat      : "+pel.getAlamat());
    System.out.println("------------");
    System.out.println("Pembelian");
    System.out.println("Kode\tNama\t\tHarga");
    for (int x = 0; x < pesanan.length; x++) {
      for (int y = 0; y < obat.length; y++) {
        if (obat[y].getKodeObat().equals(pesanan[x])) {
          System.out.print("    "+obat[y].getKodeObat());
          System.out.print("    "+obat[y].getNamaObat());  
          System.out.print("    Rp." + obat[y].getHargaObat() + ",-");
          total = total + obat[y].getHargaObat();
          System.out.println("");
        }
      }
    }
    System.out.println("-------------------------------");
    System.out.println("Total                   Rp." + total + 
    ",-");
  }
}


