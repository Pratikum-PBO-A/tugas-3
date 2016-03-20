import java.util.Scanner;
public class parsevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        value vl = new value();
        int i;
        do {
            System.out.println("1.Konversi dari angka nominal menjadi angka terbilang");
            System.out.println("2.Konversi dari angka terbilang menjadi angka nominal");
            System.out.println("3.Keluar");
            System.out.print("Pilih :");
            i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.print("Inputkan angkanya : ");
                    vl.overloadingMeth(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Inputkan angkanya : ");
                    vl.overloadingMeth(sc2.nextLine());
                    break;
                case 3:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("inputan tidak ditemukan");
            }
        } while (i != 3);
    }
}
