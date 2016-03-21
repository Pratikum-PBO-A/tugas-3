/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpraktikum3;

/**
 *
 * @author seekers
 */
import java.util.Scanner;
public class Pelanggan {
  Scanner scanNama = new Scanner(System.in);
  Scanner scanAlamat = new Scanner(System.in);
  private String Nama;
  private String Alamat;
  public Pelanggan(){
    this.Nama="";
    this.Alamat="";
  }
  public Pelanggan(String nama, String alamat){
    this.Nama=nama;
    this.Alamat=alamat;
  }
  public void setNama() {
    System.out.println("Masukkan nama   : ");
    this.Nama = scanNama.nextLine();
  }
  public void setAlamat() {
    System.out.println("Masukkan alamat : ");
    this.Alamat = scanAlamat.nextLine();
  }
  public String getNama() {
    return Nama;
  }
  public String getAlamat() {
    return Alamat;
  }    
}
