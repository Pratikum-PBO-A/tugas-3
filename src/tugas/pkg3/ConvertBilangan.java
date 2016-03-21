package bab3;

public class ConvertBilangan {

    private int bil;
    private String kata;
    static String huruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    static int angka[] = {0,1,2,3,4,5,6,7,8,9,10,11};

    public ConvertBilangan() {
    }

    public String overloadingMeth(int bil) {
        String hasil = "";
        if (bil < 12) {
            hasil=huruf[bil];
        }
        if (bil >= 12 && bil <= 19) {
            hasil=huruf[bil % 10] + " belas";
        }
        if (bil >= 20 && bil <= 99) {
            hasil=overloadingMeth(bil / 10) + " puluh " + huruf[bil % 10];
        }
        if (bil == 100) {
            hasil="seratus";
        }
        System.out.println(hasil);
        return "";
    }

    public String overloadingMeth(String kata) {
        String[] bils = kata.split(" ");
        String res = "";
        for (int i = 0; i < bils.length; i++) {
            for (int x = 0; x < huruf.length; x++) {
                if (bils[i].equalsIgnoreCase(huruf[x])) {
                    res += String.valueOf(angka[x]);
                }
            }

            if (bils[i].equalsIgnoreCase("puluh")) {
                res += "";
            } else if (bils[i].equalsIgnoreCase("ratus")) {
                if (bils.length > 3) {
                    res += "";
                } else {
                    res += "0";
                }
            } else if (bils[i].equalsIgnoreCase("belas")) {
                res = "1" + res;
            }
        }
        System.out.println(res);
        return res;
    }
}