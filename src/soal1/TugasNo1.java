package soal1;

import java.util.Scanner;

public class TugasNo1 {
    public static String overloadingMeth (int angka){
        if (angka==1) return "satu";
        else if (angka==2) return "dua";
        else if (angka==3) return "tiga";
        else if (angka==4) return "empat";
        else if (angka==5) return "lima";
        else if (angka==6) return "enam";
        else if (angka==7) return "tujuh";
        else if (angka==8) return "delapan";
        else if (angka==9) return "sembilan";
        else if (angka==10) return "sepuluh";
        else if (angka==11) return "sebelas";
        else if (angka>11 & angka<=19) return (overloadingMeth (angka%10)+" belas");
        else if  (angka>=20 && angka <=99){
            if (angka%10==0) return overloadingMeth (angka/10)+" puluh";
            else return overloadingMeth (angka/10)+" puluh "+overloadingMeth (angka%10);
        }
        else if (angka==100)return "seratus";
        else return "Error ! inputan Tidak memenuhi persyaratan atau melebihi batas";
        }
    public static String overloadingMeth(String huruf){
        String s []=huruf.split(" ");
        if (huruf.equalsIgnoreCase ("nol"))return "0";
        else if (huruf.equalsIgnoreCase ("satu"))return "1";
        else if (huruf.equalsIgnoreCase ("dua")) return "2";
        else if (huruf.equalsIgnoreCase ("tiga")) return "3";
        else if (huruf.equalsIgnoreCase ("empat")) return "4";
        else if (huruf.equalsIgnoreCase ("lima")) return "5";
        else if (huruf.equalsIgnoreCase ("enam")) return "6";
        else if (huruf.equalsIgnoreCase ("tujuh")) return "7";
        else if (huruf.equalsIgnoreCase ("delapan")) return "8";
        else if (huruf.equalsIgnoreCase ("sembilan")) return "9";
        else if (huruf.equalsIgnoreCase ("sebelas")) return "11";
        else if (huruf.equalsIgnoreCase ("sepuluh")) return "10";
        else if (s.length==2){
            if (s[1].equalsIgnoreCase ("puluh")) return overloadingMeth (s[0])+"0";
            else if (s[1].equalsIgnoreCase ("belas")) return "1"+overloadingMeth(s[0]);
            else return "Error Inputan Salah atau melebihi batas !";
        }
        else if (s.length==3){
            if (s[1].equalsIgnoreCase ("puluh")) return overloadingMeth(s[0])+overloadingMeth(s[2]);
            else return "Error Inputan Salah atau melebihi Batas !";
        }
        else if (s[1].equalsIgnoreCase ("Seratus")) return "100";
            else return "Error Inputan Salah atau melebihi Batas !";
        
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("================================================");
        System.out.println("Program Mengubah Angka > Huruf dan Huruf > Angka");
        System.out.println("================================================");
        System.out.print("Masukkan Angka :");
        int angka = input.nextInt();
        System.out.println("Hasilnya : "+overloadingMeth(angka));
        System.out.print("Masukkan Huruf :");
        input.nextLine();
        String huruf = input.nextLine();
        System.out.println("Hasilnya : "+overloadingMeth(huruf));
//System.out.println(overloadingMeth ("dua belas"));
    }

}

