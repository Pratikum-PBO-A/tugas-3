
package apotik;
public class Apotik {
 private  String nama,kode;
    int total;
    public String[] obat = {"Paracetamol", "Neuremacil", "Bodrex", "Decolgen", "Amoxicil", "Konidin" , "Promag", "Entrostop"};
    public int[] harga = {2000, 1200, 3500, 1750, 1300, 1400, 2500, 1650, 1500, 4500};
    private final String[] keluar = new String [9];
    private final  int [] hargaku= new int [10];
    static int s;
    public Apotik(String Nama, String Kode) {
       this.nama = Nama;
        kode = Kode;
        total = 0;
    }
    public void Apotik(String Nama) {
        nama = Nama;
        s = 0;
    }
    public void mainapotik() {
        for (int i = 0; i < obat.length; i++) {
            System.out.println(obat[i] + harga[i]);
        }
    }
    public void cobaapotik(String jenisobat) {
            if (jenisobat.equalsIgnoreCase("Paracetamol")) {
                keluar[s] = obat[0];
                hargaku[s]= harga [0];
                total = total + harga[0];
            } else if (jenisobat.equalsIgnoreCase("Neuremacil")) {
                keluar[s] = obat[1];
                 hargaku[s]= harga [1];
                total = total + harga[1];
            } else if (jenisobat.equalsIgnoreCase("Alpara")) {
                keluar[s] = obat[2];
                 hargaku[s]= harga [2];
                total = total + harga[2];
            } else if (jenisobat.equalsIgnoreCase("Bodrex")) {
                keluar[s] = obat[3];
                 hargaku[s]= harga [3];
                total = total + harga[3];
            } else if (jenisobat.equalsIgnoreCase("Amoxilin")) {
                keluar[s] = obat[4];
                 hargaku[s]= harga [4];
                total = total + harga[4];
            } else if (jenisobat.equalsIgnoreCase("Decolgen")) {
                keluar[s] = obat[5];
                 hargaku[s]= harga [5];
                total = total + harga[5];
            } else if (jenisobat.equalsIgnoreCase("Konidin")) {
                keluar[s] = obat[6];
                 hargaku[s]= harga [6];
                total = total + harga[6];
            
            } else if (jenisobat.equalsIgnoreCase("Promag")) {
                keluar[s] = obat[7];
                 hargaku[s]= harga [7];
                total = total + harga[7];
            } else if (jenisobat.equalsIgnoreCase("Entrostop")) {
                keluar[s] = obat[8];
                 hargaku[s]= harga [8];
                total = total + harga[8];
            }
        s++;
    }
    public void NotaPembelian() {
        System.out.println("-------APOTIK WIJAYA KUSUMA -------");
        System.out.println("Nama                :" + nama);
        System.out.println("Kode                :" + kode);
        for (int i = 0; i < s; i++) {
        System.out.println("nama barang         : "+keluar[i]);
        System.out.println("harga barang        :Rp. "+hargaku[i]);
        }
        System.out.println("______________________________");
        System.out.println("Total               :Rp. "+total);
        
        System.out.println("Barang yang sudah dibeli tidak bisa dikembalikan lagi !!");
    }
}
    
    

