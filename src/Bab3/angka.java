package bab3;
import java.util.Scanner;
public class angka {
    Scanner input = new Scanner(System.in);  
    public void overloadingMeth(int angka) {
        String datahuruf[] = {"NOL", "SATU", "DUA", "TIGA", "EMPAT",                                           
        "LIMA", "ENAM", "TUJUH", "DELAPAN", "SEMBILAN", "SEPULUH",  
        "SEBELAS", "DUA BELAS"};
        String huruf = null;
        if (angka <= 100) {
            if (angka <= 12) {
                huruf = datahuruf[angka];
            } else if (angka < 20) {
                huruf = datahuruf[(angka % 10)] + " BELAS";
            } else if (angka <= 99) {
                if (angka % 10 == 0) {
                    huruf = datahuruf[(angka / 10)] + " PULUH";
                } else if (angka % 10 != 0) {
                    huruf = datahuruf[(angka / 10)] + " PULUH " + 
                    datahuruf[(angka % 10)];
                }
            } else if (angka == 100) {
                huruf = " SERATUS ";
            }
            System.out.println("HASIL CONVERT : " + huruf);
        } else {
            System.out.println("DATA ANDA DILUAR RAGE");
        }
    }
    public void overloadingMeth(String hurufbilangan) {
        String datahuruf[] = {"NOL", "SATU", "DUA", "TIGA", "EMPAT", 
        "LIMA", "ENAM", "TUJUH", "DELAPAN", "SEMBILAN", "SEPULUH",  
        "SEBELAS", "DUA BELAS"};
        for (int i = 0; i < 13; i++) {
            if (hurufbilangan.equalsIgnoreCase(datahuruf[i])) {
                System.out.println("HASIL CONVERT : " + i);
            } else if (hurufbilangan.equalsIgnoreCase(datahuruf[i] + 
              " PULUH") || hurufbilangan.equalsIgnoreCase
              (datahuruf[i] + " PULUH")) {
              int a = Integer.parseInt(i + "0");
              System.out.println("HASIL CONVERT : " + a);
            }
            for (int j = 0; j < 13; j++) {
                if (hurufbilangan.equalsIgnoreCase(datahuruf[i] + " PULUH " + datahuruf[j]) ||hurufbilangan.equalsIgnoreCase(datahuruf[i] + "  PULUH  " + datahuruf[j])) {  
                System.out.println("HASIL CONVERT : " + i + "" + j);
                }
            }
        }
        if (hurufbilangan.equalsIgnoreCase("SERATUS")) {
            System.out.println("HASIL CONVERT : " + 100);
        }
    }
}
