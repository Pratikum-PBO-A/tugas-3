package bab3;

public class Apotek {

    private String nama;
    private String alamat;
    private int Tbelanja;
    private int Kembalian;

    public void setTbelanja(int Tbelanja) {
        this.Tbelanja = Tbelanja;
    }

    public int getTbelanja() {
        return Tbelanja;
    }

    public void setKembalian(int Kembalian) {
        this.Kembalian = Kembalian;
    }

    public int getKembalian() {
        return Kembalian;
    }

    public Apotek(String a, String b) {
        nama = a;
        alamat = b;
    }

    public Apotek() {
        System.out.println("Daftar obat");
        System.out.println("1. Obat flu\t : Rp.5000");
        System.out.println("2. Obat pusing\t : Rp.6000");
        System.out.println("3. Obat Batuk\t : Rp.8000");
    }

    public void Total(int jml, int hrg) {
        Tbelanja = Tbelanja + (jml * hrg);
        System.out.println("Harga total: " + this.Tbelanja);
    }

    public void Total(int tbayar) {
        Kembalian = tbayar - Tbelanja;
    }
}
