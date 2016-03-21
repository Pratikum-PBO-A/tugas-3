package prakpbo;

public class bilangan {
    public String Huruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    public String Hasil[] = new String[4];
    public void konversi(int i) {
        System.out.print("Hasil = ");
        if (i >= 0 && i <= 100) {
            if (i < 12) {
            System.out.println(Huruf[i]);
            } else if (i < 20) {
            System.out.println(Huruf[i - 10] + " belas");
            } else if (i < 100) {
            System.out.println(Huruf[i / 10] + " puluh " + Huruf[i % 10]);
            } else if (i == 100) {
                System.out.println("Seratus");
            }
        } else {
            System.out.println("Tidak ada output");
        }
    }
    public String konversi2(String i) {
        switch (i) {
            case "nol":
                return "0";
            case "satu":
                return "1";
            case "dua":
                return "2";
            case "tiga":
                return "3";
            case "empat":
                return "4";
            case "lima":
                return "5";
            case "enam":
                return "6";
            case "tujuh":
                return "7";
            case "delapan":
                return "8";
            case "sembilan":
                return "9";
            case "sepuluh":
                return "10";
            case "sebelas":
                return "11";
            case "seratus":
                return "100";
            default:
                Hasil = i.split(" ");
                if (Hasil.length == 2) {
                    if (Hasil[1].equals("belas")) {
                        return 1 + konversi2(Hasil[0]);
                    } else {
                        return konversi2(Hasil[0]) + "0";
                    }
                } else {
                    return konversi2(Hasil[0]) + konversi2(Hasil[2]);
                }
        }
    }
}

