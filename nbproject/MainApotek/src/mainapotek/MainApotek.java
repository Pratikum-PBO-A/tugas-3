
package mainapotek;
import java.util.Scanner;

public class MainApotek {
    
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String[] pesanan = new String[100];
  Obat[] obat = new Obat[5];
  User user = new User();
  String l = "y",loop = "y";
  int x = 0;
  do {
    cetakMenu();
    switch (scan.nextInt()) {
    case 0:
      System.out.println("Program selesai");
      l = "n";
      break;
    case 1:
      System.out.println("\nData User");
      user.setNama();
      user.setAlamat();
      System.out.println(user.getAlamat());
      System.out.println(user.getNama());
      System.out.println("");
      break;
    case 2:
      obat = Obat.daftarObat(obat);
      Obat.cetakDaftarObat(obat);
      System.out.println("Masukkan kode obat (ketik 0 untuk selesai)");
      do {
        System.out.print(">");
        pesanan[x] = scan.next();
        if (pesanan[x].equals("0")) {
          pesanan[x] = "";
          break;
        } else {
          x++;
        }
      } while (loop == "y");
      System.out.println("");
      break;
    case 3:
      Obat.pesananObat(pesanan, obat);
      System.out.println("");
      break;
    case 4:
      Obat.pesananObat(pesanan, obat, user);
      System.out.println("");
      l="n";
      break;
      }
    } while (l == "y");
  }
  public static void cetakMenu() {
    System.out.println(              "MENU"  );
      System.out.println(">>==========>>*<<==========<<");
    System.out.println("1. Masukkan data user");
    System.out.println("2. Masukkan data obat");
    System.out.println("3. Lihat pesanan");
    System.out.println("4. Cetak struk");
      System.out.println(">>==========>>*<<==========<<");
    System.out.println("0. Keluar");
    System.out.print("=> : ");
  }
}

