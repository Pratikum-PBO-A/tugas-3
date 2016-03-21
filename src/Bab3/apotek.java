package Bab3;

public class apotek {

    private String Nama;
    private String Alamat;
    private int harga;

    public apotek() {
        Nama = "";
        Alamat = "";
    }
    public apotek(String n, String a){
        Nama = n;
        Alamat = a;
    }
    public void DaftarObat(){
        System.out.println("1. parasetamol      RP.20.000");
        System.out.println("2. diapet           RP.10.000");
        System.out.println("3. betadine         RP.15.000");
        System.out.println("4. promag           RP.10.000");
        System.out.println("5. fungiderm        RP.7.000");
        System.out.println("6. geliga           RP.8.000");
        System.out.println("7. CTM              RP.6.000");
        System.out.println("8. antibiotik       RP.10.000");
        System.out.println("9. vit C            RP.9.000");
        System.out.println("10. bey bey fever   RP.12.000");
        System.out.println("ketik (stop) untuk selesai");
    }
    public void pesamObat(String obat){
        if (obat.equalsIgnoreCase("parasetamol")){
            harga += 20000;
        }
        else if (obat.equalsIgnoreCase("diapet")){
            harga += 10000;
        }
        else if (obat.equalsIgnoreCase("betadine")){
            harga += 15000;
        }
        else if (obat.equalsIgnoreCase("promag")){
            harga += 10000;
        }
        else if (obat.equalsIgnoreCase("fungiderm")){
            harga += 7000;
        }
        else if (obat.equalsIgnoreCase("geliga")){
            harga += 8000;
        }
        else if (obat.equalsIgnoreCase("CTM")){
            harga += 6000;
        }
        else if (obat.equalsIgnoreCase("antibiotik")){
            harga += 10000;
        }
        else if (obat.equalsIgnoreCase("vit C")){
            harga += 9000;
        }
        else if (obat.equalsIgnoreCase("bey bey fever")){
            harga += 12000;
        }
    }
    public void totalharga(){
        System.out.print("Total harga obat : "+ harga);
    }
}
