/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanapotek;

/**
 *
 * @author Bachtiar
 */
public class databaseapotek {

    private String Nama;
    private String Alamat;
    private String Petugas;
    private int NamaObat;
    private int Jumlah;
    private int Amoxilin, Amoxan, Oskadon, Vaksin, Panadol, Mixagrip, Sanaflu;
    private int Bayar;
    private int Total;

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public void setPetugas(String petugas) {
        Petugas = petugas;
    }

    public void setNamaObat() {
        Amoxilin = 15000;
        Amoxan = 12000;
        Oskadon = 5000;
        Vaksin = 14000;
        Panadol = 2000;
        Mixagrip = 1500;
        Sanaflu = 3000;
    }

    public void setBayar(int bayar) {
        Bayar = bayar;
    }

    public int getBayar() {        
        return Bayar;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getTotal() {        
        return Bayar;
    }

    public void showBayar() {
        System.out.println(Bayar);
    }

    public void NamaAlamat() {
        System.out.println("Nama Pembeli\t: " + Nama);
        System.out.println("Alamat Pembeli\t: " + Alamat);
        System.out.println("Petugas Apotek\t: " + Petugas);
        System.out.println();
    }

}
