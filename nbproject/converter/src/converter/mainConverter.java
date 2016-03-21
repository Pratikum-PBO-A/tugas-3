
package converter;
import java.util.Scanner;
public class mainConverter {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        Converter a = new Converter();
        System.out.print("Masukkan nilai dalam angka : ");
        int n1 = inpt.nextInt();
        a.overLoadingMeth(n1);
        System.out.print("Input angka dengan huruf : ");
        a.overLoadingMeth(inpt.nextLine());
        a.overLoadingMeth(inpt.nextLine());
        System.out.println(a.getHasilAngka());
    }

    
}


