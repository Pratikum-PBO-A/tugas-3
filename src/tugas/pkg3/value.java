
public class value {
    public static void overloadingMeth(int nomor) {
        String[] puluh = {"", "sepuluh", "dua puluh", "tiga puluh", "empat puluh",
            "lima puluh", "enam puluh", "tujuh puluh", "delapan puluh", "sembilan puluh"};
        String[] satuan = {"", "satu", "dua", "tiga", "empat",
            "lima", "enam", "tujuh", "delapan", "sembilan"};
        if (nomor >= 0 && nomor <= 100) {
            int poloh, sato;
            poloh = (nomor % 100) / 10;
            sato = nomor % 10;
            if (nomor == 0) {
                System.out.println("nol");
            } else if (nomor == 100) {
                System.out.println("seratus");
            } else if (poloh == 1) {
                if (sato == 1) {
                    System.out.println("sebelas");
                } else {
                    System.out.println(satuan[sato] + "belas");
                }
            } else {
                System.out.println(puluh[poloh] + " " + satuan[sato]);
            }
        } else {
            System.out.println("inputan nomor keluar dari range");
        }
    }
    public static void overloadingMeth(String num) {
        String[] satuan = {"nol", "satu", "dua", "tiga", "empat",
            "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas",
            "dua belas", "tiga belas", "empat belas", "lima belas", "enam belas",
            "tujuh belas", "delapan belas", "sembilan belas", "dua puluh",
            "dua puluh satu", "dua puluh dua", "dua puluh tiga", "dua puluh empat",
            "dua puluh lima", "dua puluh enam", "dua puluh tujuh", "dua puluh delapan",
            "dua puluh sembilan", "tiga puluh", "tiga puluh satu", "tiga puluh dua",
            "tiga puluh tiga", "tiga puluh empat", "tiga puluh lima", "tiga puluh enam",
            "tiga puluh tujuh", "tiga puluh delapan", "tiga puluh sembilan", "empat puluh",
            "empat puluh satu", "empat puluh dua", "empat puluh tiga", "empat puluh empat",
            "empat puluh lima", "empat puluh enam", "empat puluh tujuh", "empat puluh delapan",
            "empat puluh sembilan", "lima puluh", "lima puluh satu", "lima puluh dua",
            "lima puluh tiga", "lima puluh empat", "lima puluh lima", "lima puluh enam",
            "lima puluh tujuh", "lima puluh delapan", "lima puluh sembilan", "enam puluh",
            "enam puluh satu", "enam puluh dua", "enam puluh tiga", "enam puluh empat",
            "enam puluh lima", "enam puluh enam", "enam puluh tujuh", "enam puluh delapan",
            "enam puluh sembilan", "tujuh puluh", "tujuh puluh satu", "tujuh puluh dua",
            "tujuh puluh tiga", "tujuh puluh empat", "tujuh puluh lima", "tujuh puluh enam",
            "tujuh puluh tujuh", "tujuh puluh delapan", "tujuh puluh sembilan", "delapan puluh",
            "delapan puluh satu", "delapan puluh dua", "delapan puluh tiga", "delapan puluh empat",
            "delapan puluh lima", "delapan puluh enam", "delapan puluh tujuh",
            "delapan puluh delapan", "delapan puluh sembilan", "sembilan puluh",
            "sembilan puluh satu", "sembilan puluh dua", "sembilan puluh tiga",
            "sembilan puluh empat", "sembilan puluh lima", "sembilan puluh enam",
            "sembilan puluh tujuh", "sembilan puluh delapan", "sembilan puluh sembilan", "seratus"};
        for (int i = 0; i < satuan.length; i++) {
            if (num.equalsIgnoreCase(satuan[i])) {
                System.out.println("outputnya adalah " + i);
            }
        }
    }
}
