package BenimJava.j19_StaticVariable;

public class C02_StaticBlok {

    static String isim = "sefil haluk";//gns -> static var.

        /*
       1.static block yapıları static variable'rı değer ataması update için kullanılır
       2.static block Class oluşturulduğunda butun method'lardan(main method dahil) önce çalışır
       3.birden fazla static block varsa yukarıdan aşagiya sıralama ile çalışır.
        */


    static {//2. çalışacak static block
        System.out.println("agam 1. static block çalıştı :) ");
        isim = "Dilek Hanım";
        System.out.println("isim = " + isim);//Dilek Hanım
    }
    public static void main(String[] args) {//main bası
        System.out.println("main method başladı :) ");
        isim = "Kerim Bey";
        System.out.println("isim = " + isim);//Kerim Bey
        System.out.println("main method bitti :( ");//main method bitti :(

    }//main sonu

    static {//ilk çalışacak static block
        System.out.println("isim = " + isim);//sefil haluk
        System.out.println("agam 2. static block çalıştı :) ");
        isim = "UGUR JavaCAN";
        System.out.println("isim = " + isim);//UGUR JavaCAN
    }
}




