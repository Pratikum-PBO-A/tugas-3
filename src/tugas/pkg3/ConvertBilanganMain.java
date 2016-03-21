package bab3;

import java.util.Scanner;

public class ConvertBilanganMain {

    public static void main(String[] args) {
        ConvertBilangan con = new ConvertBilangan();
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Input bilangan : ");
        con.overloadingMeth(scn.nextInt());
        scn.nextLine();
        System.out.print("\nInput Nilai Terbilang : ");
        con.overloadingMeth(scn.nextLine());
    }
}
