package Modul1_Bab3;

/**
 *
 * @author abdu_
 */
public class Costumers {

    String nama, alamat;
    Obat[] daftarObat;
    int totalHarga;

    Costumers(String n, String a) {
        nama = n;
        alamat = a;
    }

    Costumers(String n, String a, Obat[] daftar) {
        nama = n;
        alamat = a;
        daftarObat = daftar;
        for (int i = 0; i < daftarObat.length; i++) {
            totalHarga += daftarObat[i].harga;
        }
    }

    Costumers(Obat[] daftar) {
        daftarObat = daftar;
        for (int i = 0; i < daftarObat.length; i++) {
            totalHarga += daftarObat[i].harga;
        }
    }

    public void display(String a) {
        System.out.println("\n\t===== Daftar Obat ===== ");
        System.out.println("Kode\tNama\t\tHarga");
        System.out.println("1\tOBH\t\tRp. 29000");
        System.out.println("2\tParacetamol\tRp. 2000");
        System.out.println("3\tProbiotik\tRp. 15000");
        System.out.println("4\tUltraflu\tRp. 5000");
        System.out.println("5\tMylanta\t\tRp. 36000");
    }

    public void display() {
        System.out.println("===== Data Konsumen =====");
        System.out.println("Nama\t: " + nama);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("----- Daftar Obat -----");
        for (int i = 0; i < daftarObat.length; i++) {
            System.out.printf("Nama obat %d  : %s\n", (i + 1), daftarObat[i].nama);
            System.out.printf("Harga obat %d : Rp. %s\n", (i + 1), daftarObat[i].harga);
            System.out.println("-------------------------");
        }
        System.out.println("Total Harga  : Rp." + totalHarga);
    }
}