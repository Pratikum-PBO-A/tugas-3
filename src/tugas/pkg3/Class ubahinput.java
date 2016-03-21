public class ubahInput {
    public static String angka []= {"","satu","dua","tiga", "empat","lima","enam","tujuh","delapan","sembilan","sepuluh","sebelas"};
    public static void OverloadingMeth(int a){
        if (a>=0 &&a<=100){
            if (a==0)
                System.out.println(" nol ");
            else if (a<12)
                System.out.println(angka[a]);
            else if (a<20)
                System.out.println(angka[a-10]+" belas");
            else if (a<100)
                System.out.println(angka[a/10]+" puluh "+angka[a%10]);
            else if (a==20||a==30||a==40||a==50||a==60||a==70||a==80||a==90)
                System.out.println(angka[a/10]+" puluh");
           else if (a==100)
                System.out.println("Seratus");
        }
        else
            System.out.println("Bilangan yang anda masukkan tidak tersedia");
    }
        static String overloadingMeth(String s) {
        String bilangan[] = new String[4];
        if (s.equalsIgnoreCase("nol")) return "0";
        else if (s.equalsIgnoreCase("satu")) return "1";
        else if (s.equalsIgnoreCase("dua")) return "2";
        else if (s.equalsIgnoreCase("tiga")) return "3";
        else if (s.equalsIgnoreCase("empat")) return "4";
        else if (s.equalsIgnoreCase("lima")) return "5";
        else if (s.equalsIgnoreCase("enam")) return "6";
        else if (s.equalsIgnoreCase("tujuh")) return "7";
        else if (s.equalsIgnoreCase("delapan")) return "8";
        else if (s.equalsIgnoreCase("sembilan")) return "9";
        else if (s.equalsIgnoreCase("sepuluh")) return "10";
        else if (s.equalsIgnoreCase("sebelas")) return "11";
        else if (s.equalsIgnoreCase("seratus")) return "100";
        else {
            bilangan = s.split(" ");
            if (bilangan.length == 2) {
                if (bilangan[1].equalsIgnoreCase("belas")) {
                    return 1 + overloadingMeth(bilangan[0]);
                } else {
                    return overloadingMeth(bilangan[0]) + "0";
                }
            } else {
                return overloadingMeth(bilangan[0]) + overloadingMeth(bilangan[2]);
            }
        }
    }
    }
