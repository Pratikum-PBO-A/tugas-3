package javaapplication68;
public class Apotik {
    public String jenisObat[]={"","Bodrex","paracetamol","Anakonidin Sirup", "Betadine"
                               ,"Kain Kasa"};
    public int hargaObat[]={0,2500,10000,15000,5000,3500};            
    public int hargaTotal=0;
    public String totalJenisObat="";
    public Apotik(int a){
    }
    public Apotik(){
    }
    public void obat(){
        String obat;
        System.out.println("");
        System.out.println("daftar obat dan harganya : ");
        System.out.println("1."+jenisObat[1]+" "+hargaObat[1]);
        System.out.println("2."+jenisObat[2]+" "+hargaObat[2]);
        System.out.println("3."+jenisObat[3]+" "+hargaObat[3]);
        System.out.println("4."+jenisObat[4]+" "+hargaObat[4]);
        System.out.println("5."+jenisObat[5]+" "+hargaObat[5]);
        System.out.println("");
}
    public void obat(int a){
        totalJenisObat = totalJenisObat+jenisObat[a]+", ";
        hargaTotal=hargaTotal+hargaObat[a];
        System.out.println("Anda membeli "+jenisObat[a]);
        System.out.println("================================");
    }
}