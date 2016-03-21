package Modul1_Bab3;

/**
 *
 * @author abdu_
 */
public class KonversiBil {
    
        String[] terbilang = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas", "belas"};
        int[] angka = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 10};
        String[] xTerbilang = {"kosong", "nol", "seratus", "seribu", "sejuta", "", "", "", "", "", "", "", ""};
        String[] yTerbilang = {"puluh", "ratus", "ribu", "juta", "milyar", "", "", "", "", "", "", "", "", ""};
        int[] xAngka = {0, 0, 100, 1000, 1000000, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] yAngka = {10, 100, 1000, 1000000, 1000000000, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        String x = "";
        int y = 0;

        public String overloadingMethod(int bil) {
            if (bil > 0 && bil < 12) {
                x = terbilang[bil];
            } else if (bil >= 12 && bil < 20) {
                x = overloadingMethod(bil - 10) + " Belas ";
            } else if (bil >= 20 && bil < 100) {
                x = overloadingMethod(bil / 10) + " Puluh " + terbilang[bil % 10];
            } else if (bil == 100) {
                x = "Seratus";
            } else if (bil == 0) {
                x = "Kosong/Nol";
            } else {
                x = "Bilangan diluar range (0-100)!";
            }
            return x;
        }

        public void overloadingMethod(String kalimat) {
            String ubahKalimat = kalimat.toLowerCase();
            String[] kata = ubahKalimat.split("\\s+");
            int hasil = 0;
            for (int i = 0; i < kata.length; i++) {
                for (int j = 0; j < terbilang.length; j++) {
                    if (kata[i].equalsIgnoreCase(terbilang[j])) {
                        hasil += angka[j];
                        j = terbilang.length;
                    } else if (kata[i].equalsIgnoreCase(xTerbilang[j])) {
                        if (i == 0) {
                            hasil += xAngka[j];
                        } else {
                            i = kata.length;
                            hasil = 1000;
                        }
                        j = terbilang.length;
                    } else if (kata[i].equalsIgnoreCase(yTerbilang[j])) {
                        if (i == 1) {
                            hasil *= yAngka[j];
                        } else {
                            i = kata.length;
                            hasil = 1000;
                        }
                        j = terbilang.length;
                    }
                }
            }
            this.y = hasil;
        }
    }