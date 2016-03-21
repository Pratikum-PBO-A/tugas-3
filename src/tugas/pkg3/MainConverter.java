/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpraktikum3;
import java.util.Scanner;
public class MainConverter {
    static Scanner in = new Scanner(System.in);
    static int g,h ;
    public static void main(String[] args) {
         Converter con = new Converter();
         do{
         System.out.println("Menu Converter");
         System.out.println("===============");
         System.out.println("1.Angka    -->     Huruf");
         System.out.println("2.Huruf    -->     Angka");
         System.out.println("0.Keluar");
         System.out.print("Masukkan Pilihan   : ");
         h = in.nextInt();
         
         switch(h){
             case 1 :
             con.setBilangan();
             con.overloadingMeth(con.getBilangan());
             System.out.println("Apakah Anda Ingin Kembali Ke Awal ?");
             System.out.print(" 1. Ya");
             System.out.println(" 2. Tidak");
             System.out.print("Pilihan : ");
             g=in.nextInt();
             break;
             case 2 :
             con.setHuruf();
             con.OverloadingMeth(con.getHuruf());
             System.out.println("Apakah Anda Ingin Kembali Ke Awal ?");
             System.out.print(" 1. Ya");
             System.out.println(" 2. Tidak");
             System.out.println("Pilihan : ");
             g=in.nextInt();
         }
         }   while(h!=0 && g!=2);      
         
         
         
         
         }
   
    
}
