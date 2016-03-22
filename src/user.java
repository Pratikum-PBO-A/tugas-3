import java.util.Scanner;
public class User {
    Scanner scanNama = new Scanner(System.in);
  Scanner scanAlamat = new Scanner(System.in);
  private String Nama;
  private String Alamat;
  public User(){
    this.Nama="Belum diisi";
    this.Alamat="Belum diisi";
  }
  public User(String nama, String alamat){
    this.Nama=nama;
    this.Alamat=alamat;
  }
  public void setNama() {
    System.out.print("Masukkan nama\t: ");
    this.Nama = scanNama.nextLine();
  }
  public void setAlamat() {
    System.out.print("Masukkan alamat\t: ");
    this.Alamat = scanAlamat.nextLine();
  }
  public String getNama() {
    return Nama;
  }
  public String getAlamat() {
    return Alamat;
  }    
}