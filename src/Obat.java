package Modul1_Bab3;

/**
 *
 * @author abdu_
 */
public class Obat {

    String nama;
    int harga;

    Obat(int kode) {
        switch (kode) {
            case 1:
                nama = "OBH";
                harga = 29000;
                break;
            case 2:
                nama = "Paracetamol";
                harga = 2000;
                break;
            case 3:
                nama = "Probiotik";
                harga = 15000;
                break;
            case 4:
                nama = "Ultraflu";
                harga = 5000;
                break;
            case 5:
                nama = "Mylanta";
                harga = 36000;
                break;
            default:
                nama = "Tidak tersedia";
                harga = 0;
        }
    }
}