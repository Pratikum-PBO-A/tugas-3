public class MainUbahInput {
     static String bil;
    public static void main(String[] args) {
        System.out.println("******************************************");
        System.out.println("\tProgram Pengubah Inputan");
System.out.println("==========================================");
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka(0-100)(dalam angka): ");
        int bilangan = input.nextInt();
        System.out.println("Teks:");
        ubahInput.OverloadingMeth(bilangan);
        System.out.println("===========================================");
        
        System.out.print("Masukkan angka(0-100)(dalam teks):");
        bil = input.nextLine();
        bil = input.nextLine();
        System.out.println("Bilangan :");
        System.out.println(ubahInput.overloadingMeth(bil));
        
        System.out.println("===========================================");

    }
}
