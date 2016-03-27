package tugas.pkg3;
public class soal2_Apotek {
    private String name;
    private String address;
    private int harga1, harga2, harga3;
    private int banyak;
    private double total;
    public int harga[] = {5000, 10000, 12500};
    public soal2_Apotek () {
        this.name = "";
        this.address = "";
    }
    public soal2_Apotek (String nama, String alamat){
        this.name = nama;
        this.address = alamat;
    }
    public void jumlah (int j){
        this.banyak = j;
    }
    public int price1(){
        return this.harga1 = banyak*harga[0];
    }
    public int price2(){
        return this.harga2 = banyak*harga[1];
    }
    public int price3(){
        return this.harga3 = banyak*harga[2];
    }
    public void jumlah(){
        this.total = this.harga1 + this.harga2 + this.harga3;
    }
    public double getJumlah (){
        return this.total;
    }
    public void display(){
        System.out.println("============================");
        System.out.println("   A P O T E K  S E G A R");
        System.out.println("============================");
        System.out.println("Nama\t\t: " + this.name);
        System.out.println("Alamat\t\t: " + this.address);
        System.out.println("Total Harga\t: Rp " + getJumlah());
    }
}
