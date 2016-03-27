package tugas.pkg3;
import java.util.Scanner;
public class soal1 {

    private String Huruf[] = {" ", "satu", "dua", "tiga", "empat",
        "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    private String Hsatuan = "";
    private String Hpuluhan = "";
    private String Hratusan = "";
    private String Hribuan = "";
    private int Satuan = 0;
    private int Puluhan = 0;
    private int Ratusan = 0;
    private int Ribuan = 0;

    public void soal1(String Huruf1) {
        String[] kalimat = Huruf1.split(" ");
        for (int i = 0; i < kalimat.length; i++) {
            if ("ribu".equalsIgnoreCase(kalimat[i])) {
                for (int j = 0; j < Huruf.length; j++) {
                    if (kalimat[i - 1].equalsIgnoreCase(Huruf[j])) {
                        Ribuan = j * 1000;
                    }
                }
            } else if ("seribu".equalsIgnoreCase(kalimat[i])) {Ribuan = 1000; }
            if ("ratus".equalsIgnoreCase(kalimat[i])) {
                for (int j = 0; j < Huruf.length; j++) {
                    if (kalimat[i].equalsIgnoreCase(Huruf[j])) {
                        Ratusan = j * 100;
                    }
                }
            } else if ("seratus".equalsIgnoreCase(kalimat[i])) {
                Ratusan = 100;
            }
            if ("puluh".equalsIgnoreCase(kalimat[i])) {
                for (int j = 0; j < Huruf.length; j++) {
                    if (kalimat[i - 1].equalsIgnoreCase(Huruf[j])) {
                        Puluhan = j * 10;
                    }
                }
            }
            if ("belas".equalsIgnoreCase(kalimat[i])) {
                for (int j = 0; j < Huruf.length; j++) {
                    if (kalimat[i - 1].equalsIgnoreCase(Huruf[j])) {
                        Puluhan = j + 10;
                    }
                }
            }
        }
        System.out.print("Jika dalam angka : ");
        System.out.println(Ribuan + Ratusan + Puluhan);
    }

    public void Overloading(String Huruf2) {
        String[] kalimat = Huruf2.split(" ");
        for (int i = 0; i < kalimat.length; i++) {
            for (int indeks = 0; indeks < Huruf.length; indeks++) {
                if (Huruf[indeks].equalsIgnoreCase(kalimat[i])) {
                    Satuan = indeks;
                }
            }
            System.out.print("Jika dalam angka : ");
            System.out.println(Satuan);
        }
    }

    public void overloading(int angka1) {
        Ribuan = angka1 % 1000;
        Ratusan = angka1 % 100;
        Puluhan = angka1 % 10;
        Satuan = Puluhan;
        Puluhan = (Ratusan - Puluhan) / 10;
        Ratusan = (Ribuan - Puluhan) / 100;
        Ribuan = (angka1 - Ribuan) / 1000;
//ribuan
        if (Ribuan == 1) {
            Hribuan = "Seribu";
        } else {
            if (Ribuan == 0) {
                Hribuan = "";
            } else {
            Hribuan = Huruf[Ribuan] + " " + "ribu";
            }
        }
//ratusan
        if (Ratusan == 1) {
            Hratusan = "Seratus";
        } else {
            if (Ratusan == 0) {
                Hratusan = "";
        } else {
            Hratusan = Huruf[Ratusan] + " " + "Ratus";
        }
    }
//puluhan dan satuan
        if (Puluhan == 1) {
            if (Satuan == 0) {
                Hpuluhan = "Sepuluh";
                Hsatuan = Huruf[Satuan];
            } else {
                if (Satuan == 1) {
                    Hpuluhan = "Sebelas";
                    Hsatuan = "";
            }
        }
        } else if (Puluhan == 0) {
            Hpuluhan = "";
            Hsatuan = Huruf[Satuan];
        } else {
            Hpuluhan = Huruf[Puluhan] + " " + "Puluh";
            Hsatuan = Huruf[Satuan];
        }
        System.out.print("Jika dalam huruf maka : " + Hribuan + " " + Hratusan + " " + Hpuluhan + " " + Hsatuan);
    }

}
