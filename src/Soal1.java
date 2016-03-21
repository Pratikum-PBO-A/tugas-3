package Bab3;
public class Soal1 {
    
    public String overloadingMeth(int angka){
        String[] huruf ={"","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
		String hasil = "";
		if(angka==0)
                    hasil = "Nol";
                else if(angka<12)
                    hasil = hasil + huruf[angka];
		else if(angka<20)
                    hasil = hasil + overloadingMeth(angka-10) + " Belas";
		else if(angka<100)
                    hasil = hasil + overloadingMeth(angka/10) + " Puluh " + overloadingMeth(angka%10);
		else if(angka==100)
                    hasil = "Seratus";
                else if(angka>100)
                    hasil="Angka Terlalu Besar!";
                return hasil;
    }
 
    public void overloadingMeth(String huruf){
      
    }
}
