package praktikum3;

import java.util.Scanner;

public class Apotik {
    String nama, alamat;
    String []order=new String[10];
    int []harga=new int[10];
    static int total=0;
    static int banyakobat=0;
     public Apotik(){
        this.nama = "";
        this.alamat = "";  
    }
    public Apotik(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    public void drugstore(String ob, int jml){
        Scanner input= new Scanner(System.in);
        
            switch(ob){
                case "Konidin" :
                case "konidin" : order[banyakobat]="konidin";
                                 harga[banyakobat]=5000*jml;
                                 break;
                case "Mixagrip" :
                case "mixagrip" : order[banyakobat]="Mixagrip";
                                harga[banyakobat]=15000*jml;
                                break;
                case "Promag" :
                case "promag" : order[banyakobat]="Promag";
                                harga[banyakobat]=10000*jml;
                                break;
                case "Insana" :
                case "insana" : order[banyakobat]="Insana";
                                harga[banyakobat]=7000*jml;
                                break;
                default :
                    System.out.println("Obat tidak tersedia");
            }          
            banyakobat++;
            
    }
    public void drugstore(){
        
        for (int i = 0; i < banyakobat; i++) {
            total += harga[i];
            
        }
        System.out.println("Total pembayaran : Rp "+total);
    }
}