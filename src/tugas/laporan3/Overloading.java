package laporan3;
public class Overloading {
    public String Huruf[] = {"nol", "satu", "dua", "tiga", "empat", "lima",
    "enam", "tujuh", "delapan", "sembilan", "sepuluh", "sebelas"};
    public String keluaran[] = new String[4];
    void AngkakeHuruf(int i) {
        System.out.print("Keluaran = ");
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
            System.out.println("Maaf sistem eror :)");
        }
    }
    public String HurufkeAngka(String i) {
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
            case "epuluh":
                return "10";
            case "sebelas":
                return "11";
            case "seratus":
                return "100";
            default:
                keluaran = i.split(" ");
                if (keluaran.length == 2) {
                    if (keluaran[1].equals("belas")) {
                        return 1 + HurufkeAngka(keluaran[0]);
                    } else {
                        return HurufkeAngka(keluaran[0]) + "0";
                    }
                } else {
                    return HurufkeAngka(keluaran[0]) + HurufkeAngka(keluaran[2]);
                }
        }
    }
}

    
