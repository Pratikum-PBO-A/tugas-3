package mainapotek;

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
    String[] kodeObat = {"001", "002", "003", "004", "005"};
    String[] namaObat = {"Albotil   ", "Puyer 16", 
    "Entro Stop", "Neosep Forte", "Sana Flu"};
    int[] hargaObat = {10000, 11000, 5000, 15000, 6000};
    for (int x = 0; x < obat.length; x++) {
      obat[x] = new Obat();
      obat[x].setKodeObat(kodeObat[x]);
      obat[x].setNamaObat(namaObat[x]);
      obat[x].setHargaObat(hargaObat[x]);
    }
    return obat;
  }
  public static void cetakDaftarObat(Obat[] obat) {
    System.out.println("\nDaftar Obat");
    System.out.println("Kode\tNama\t\tHarga");
    for (int x = 0; x < obat.length; x++) {
      System.out.print(obat[x].getKodeObat() + "\t");
      System.out.print(obat[x].getNamaObat() + "\t");
      System.out.printf("Rp." + obat[x].getHargaObat() + ",-" +"\n");

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
          System.out.print("Rp." + obat[y].getHargaObat() + ",-");
          total = total + obat[y].getHargaObat();
          System.out.println("");
        }
      }
    }
    System.out.println("----------------------  +");
    System.out.println("Total = Rp." + total + ",-");
  }
  public static void pesananObat(String[] pesanan, Obat[] obat, 
  User user) {
    int total = 0;
    System.out.println("APOTEK SEHAT");
    System.out.println("------------");
    System.out.println("a.n Bpk/Ibu : "+user.getNama());
    System.out.println("alamat      : "+user.getAlamat());
    System.out.println("------------");
    System.out.println("Pembelian");
    System.out.println("Kode\tNama\t\tHarga");
    for (int x = 0; x < pesanan.length; x++) {
      for (int y = 0; y < obat.length; y++) {
        if (obat[y].getKodeObat().equals(pesanan[x])) {
          System.out.print(obat[y].getKodeObat() + "\t");
          System.out.print(obat[y].getNamaObat() + "\t");
          System.out.printf("Rp." + obat[y].getHargaObat() + 
          ",-" + "\n");
          total = total + obat[y].getHargaObat();
        }
      }
    }
    System.out.println("----------------------------------    +");
    System.out.println("Total                   Rp." + total + 
    ",-");
  }
}