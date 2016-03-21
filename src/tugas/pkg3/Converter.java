/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpraktikum3;

import java.util.Scanner;
public class Converter {
   private int bilangan;
   private String huruf;
   static Scanner in = new Scanner(System.in);
    public int getBilangan() {
        return bilangan;
    }

    public void setBilangan() {
        System.out.println("Masukkan Bilangan : ");    
        this.bilangan = in.nextInt();
    }

    public String getHuruf() {
        return huruf;
    }

    public void setHuruf() {
        System.out.println("Masukkan Huruf  : ");
        this.huruf = in.nextLine();
    }
   
    
    public String overloadingMeth(int a){
        
        String bilang = "";
        String[]huruf = {"Nol","Satu","Dua","Tiga","Empat","Lima","Enam","Tujuh","Delapan","Sembilan","Sepuluh","Sebelas"};
        System.out.println("Input    : OverloadingMeth("+a+")");
        int k = a-10;
        int c = a-20;
        int f = a-30;
        int y = a-40;
        int r = a-50;
        int e = a-60;
        int g = a-70;
        int l = a-80;
        int q = a-90;
        if(a<12){
            do{
                System.out.println("Output  : "+huruf[a]);
            }while(huruf.length/a==0);
            }
        else if(a==0){
            System.out.println("Output  : "+huruf[0]);
        }
        else if (a==100){
            System.out.println("Output  : Seratus");
        }
        else if(a>11 && a<20){
            do{
                System.out.println("Output  : "+huruf[k]+" Belas");
            }while(huruf.length/k==0);
            }
        else if(a>19 && a<30){
            if(a==20){
                System.out.println("Output  : Dua Puluh");
            }
            else{
            do{
                System.out.println("Output  : "+huruf[1]+" Puluh "+huruf[c]);
            
            }while(huruf.length/c==0);
    
            }
                        
        }
        else if(a>29 && a<40){
            if(a==30){
                System.out.println("Output  : Tiga Puluh");
            }
            else{
            do{
                System.out.println("Output  : "+huruf[2]+" Puluh "+huruf[f]);
            
            }while(huruf.length/f==0);
            }
        }
        else if(a>39 && a<50){
            if(a==40){
                System.out.println("Output  : Empat Puluh");
            }
            else {
                do{
                System.out.println("Output  : "+huruf[3]+" Puluh "+huruf[y]);
            
            }while(huruf.length/y==0);
            }
        }
        else if(a>49 && a<60){
            if(a==50){
                System.out.println("Output  : Lima Puluh");
            }
            else {
                do{
                   System.out.println("Output  : "+huruf[4]+" Puluh "+huruf[r]);
            }while(huruf.length/r==0);

            }
        }
        else if(a>59 && a<70){
           if(a==60){
               System.out.println("Output   : Enam Puluh");
           }
           else {
                do{
                   System.out.println("Output  : "+huruf[5]+" Puluh "+huruf[e]);
            }while(huruf.length/e==0);
           }
        }
      else if(a>69 && a<80){
            if(a==70){
                System.out.println("Output  : Tujuh Puluh");
            }
            else {
                do{
                   System.out.println("Output  : "+huruf[6]+" Puluh "+huruf[g]);
            }while(huruf.length/g==0);
            }
        }
        else if(a>79 && a<90){
            if(a==80){
                System.out.println("Output  : Delapan Puluh");
            }
            else{
                do{
                   System.out.println("Output  : "+huruf[7]+" Puluh "+huruf[l]);
            }while(huruf.length/l==0);
            }
        }
        else if(a>89 && a<100){
            if(a==90){
                System.out.println("Output  : Sembilan Puluh");
            }
            else {
                do{
                   System.out.println("Output  : "+huruf[8]+" Puluh "+huruf[q]);
            }while(huruf.length/q==0);
            }
        }
       return bilang; 
    }
    
    public int OverloadingMeth(String b){
        int o=0;
        String[]huruf = b.split(" ");
        int x;
        System.out.println("Input    : OverloadingMeth("+b+")");
            String temp1 = "", temp2 = "";
        
      for ( x = 0; x < huruf.length; x++) {
      if (huruf[x].equals("nol")) {
        temp1 = "0";
      } else if (huruf[x].equals("satu")) {
        temp1 = "1";
      } else if (huruf[x].equals("belas")) {
         temp1 = "1";
      } else if (huruf[x].equals("dua")) {
         temp1 = "2";
      } else if (huruf[x].equals("tiga")) {
         temp1 = "3";
      } else if (huruf[x].equals("empat")) {
         temp1 = "4";
      } else if (huruf[x].equals("lima")) {
         temp1 = "5";
      } else if (huruf[x].equals("enam")) {
         temp1 = "6";
      } else if (huruf[x].equals("tujuh")) {
         temp1 = "7";
      } else if (huruf[x].equals("delapan")) {
         temp1 = "8";
      } else if (huruf[x].equals("sembilan")) {
         temp1 = "9";
      } else if (huruf[x].equals("sepuluh")) {
         temp1 = "10";
      } else if (huruf[x].equals("sebelas")) {
         temp1 = "11";
      } else if (huruf[x].equals("seratus")) {
         temp1 = "100";
      } else {
         temp1 = "";
      }

      if (huruf[x].equals("puluh")) {
         if (huruf.length == 2) {
           temp2 = temp2 + "0";
         } else {
           temp2 = temp2 + temp1;
         }
       } else if (huruf[x].equals("belas")) {
         temp2 = temp1 + temp2;
       } else {
          temp2 = temp2 + temp1;
       }
     }
        System.out.println("output  : "+temp2);    
    
    return o;

    
   
    } 
        
}
 
