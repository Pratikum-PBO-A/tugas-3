/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpraktikum3;


import java.util.Scanner;
public class Apotek {
    static Scanner scan = new Scanner(System.in);
    static int j,k;
    public static void cetakMenu() {
    System.out.println("Apotek Jaya Makmur");    
    System.out.println("MENU");
    System.out.println("1. Inputan data user");
    System.out.println("2. Inputan Pesanan Obat");
    System.out.println("3. Inputan data obat");
    System.out.println("4. Lihat pesanan");
    System.out.println("5. Cetak struk");
    System.out.println("0. Keluar");
    System.out.println("*Note : Cetak Struk Harus Mengisi Data User dan Obat Pesanan Terlebih Dahulu");
    System.out.print("Piihan : ");
        k = scan.nextInt();
    }
  public static void main(String[] args) {
  
  String[] pesanan = new String[100];
  Obat[] obat = new Obat[6];
  Pelanggan pel = new Pelanggan();
  
  int x = 0;
  do {
    cetakMenu();
    switch (k) {
    case 0:
      System.out.println("Program selesai");
      
      break;
    case 1:
      System.out.println("Data User >>");
      pel.setNama();
      pel.setAlamat();
      System.out.println("Data");
      System.out.println("===================");
      System.out.println("Nama          : "+pel.getNama());
      System.out.println("Alamat        : "+pel.getAlamat());
      System.out.println("");
      break;
    case 2:
        System.out.println("Masukkan Jumlah Pesanan Obat");
        System.out.println("============================");
        System.out.println("Jumlah : ");
        j = scan.nextInt();
        break;
    case 3:
      obat = Obat.daftarObat(obat);
      Obat.cetakDaftarObat(obat);
      System.out.println("Masukkan kode obat ");
      for(int a = 0; a<j; a++){
        System.out.print("Pesanan   = ");
        pesanan[x]=scan.next();
        x++;
        
      }
      break;
    case 4:
      Obat.pesananObat(pesanan, obat);
      System.out.println("");
      break;
    case 5:
      Obat.pesananObat(pesanan, obat, pel);
      System.out.println("");
      System.out.println("Terima Kasih Atas Pembelian Anda");
      k=0;
      break;
      }
    } while (k != 0);
  }
  
}

