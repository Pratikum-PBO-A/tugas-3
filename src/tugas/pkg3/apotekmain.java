
package prakpbo;
import java.util.Scanner;
public class apotekmain {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String obat[][]= new String [][]{{"obat kumur","5000"},{"obat pusing","3500"},
        {"obat panas","4500"},{"obat mual","1000"},{"obat kb","5900"},
        {"obat luka","5500"},{"obat sakit perut","5050"},{"obat panu","4535"},
        {"obat gatal","2340"},{"betadin","3400"}};
        String nama, alamat;
        int a, pilih;
        apotek pembeli = new apotek();
        pembeli.setObat(obat);
        System.out.println("Masukkan Identitas Pembeli ");
        System.out.print("Masukkan Nama Pembeli : ");
        nama = in.nextLine();
        System.out.print("Masukkan Alamat Pembeli : ");
        alamat = in.nextLine();
        pembeli.setData(nama, alamat);
        do {
            System.out.println("Masukkan pilihan : \n 1. Lihat data pembeli \n 2. Pilih obat \n 3. Keluar");
            a=in.nextInt();
            System.out.println("Pilihan Anda :");
            switch (a){
                case 1 : pembeli.lihatPasien(); 
                break;
                case 2 : pembeli.lihatObat();
                pilih = in.nextInt();
                if(pilih>=1&&pilih<=10){
                    pembeli.pilihObat(pilih); }
                else{
                    System.out.println("Data tidak ditemukan, mohon ulangi.");} 
                break;
                case 3 : 
                break;
                default : System.out.println("Tidak ada dalam pilihan, mohon ulangi."); }
        } while (a!=3);}
}

