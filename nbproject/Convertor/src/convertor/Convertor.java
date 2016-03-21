
package convertor;

public class Convertor {

    private String terbilang;
  
    private int bilangan;
  public void setBilangan(int bilangan) {
    this.bilangan = bilangan;
   }
  public void setTerbilang(String terbilang) {
    this.terbilang = terbilang;
   }
  public int getBilangan() {
    return bilangan;
   }
  public String getTerbilang() {
    return terbilang;
   }  
  
  
  public String overloadingMeth(int bilangan) {
    String[] angka = {"Nol", "Satu", "Dua", "Tiga", "Empat", 
    "Lima", "Enam", "Tujuh", "Delapan", "Sebilan", "Sepuluh",  
    "Sebelas"};
    
    String output = "";
    if (bilangan < 12) {
      output = angka[bilangan];
    } else if (bilangan == 20
            || bilangan == 30
            || bilangan == 40
            || bilangan == 50
            || bilangan == 60
            || bilangan == 70
            || bilangan == 80
            || bilangan == 90)
    
    {
        output = angka[bilangan / 10] + " Puluh";
    } else if (bilangan < 20) {
        output = angka[bilangan - 10] + " Belas";
    } else if (bilangan < 100) {
        output = angka[bilangan / 10] + " Puluh " + 
        angka[bilangan % 10];
    } else if (bilangan == 100) {
       output = "Seratus";
    }
    return output;
  }
  public int overloadingMeth(String bilangan) {
    int output = 0;
    String temp1 = "", temp2 = "";
    String[] parts = bilangan.split(" ");
    for (int x = 0; x < parts.length; x++) {
      if (parts[x].equals("nol")) {
        temp1 = "0";
      } else if (parts[x].equals("satu")) {
        temp1 = "1";
      } else if (parts[x].equals("belas")) {
         temp1 = "1";
      } else if (parts[x].equals("dua")) {
         temp1 = "2";
      } else if (parts[x].equals("tiga")) {
         temp1 = "3";
      } else if (parts[x].equals("empat")) {
         temp1 = "4";
      } else if (parts[x].equals("lima")) {
         temp1 = "5";
      } else if (parts[x].equals("enam")) {
         temp1 = "6";
      } else if (parts[x].equals("tujuh")) {
         temp1 = "7";
      } else if (parts[x].equals("delapan")) {
         temp1 = "8";
      } else if (parts[x].equals("sembilan")) {
         temp1 = "9";
      } else if (parts[x].equals("sepuluh")) {
         temp1 = "10";
      } else if (parts[x].equals("sebelas")) {
         temp1 = "11";
      } else if (parts[x].equals("seratus")) {
         temp1 = "100";
      } else {
         temp1 = "";
      }

      if (parts[x].equals("puluh")) {
         if (parts.length == 2) {
           temp2 = temp2 + "0";
         } else {
           temp2 = temp2 + temp1;
         }
       } else if (parts[x].equals("belas")) {
         temp2 = temp1 + temp2;
       } else {
          temp2 = temp2 + temp1;
       }
     }
    output = Integer.parseInt(temp2);
    return output;
  }
  public void cetak(String cetak) {
    System.out.println(cetak);
  }
  public void cetak(int cetak) {
    System.out.println(cetak);
  }
}

