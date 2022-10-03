package BenimJava.j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
// kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.

        Scanner scan = new Scanner(System.in);// Scanner classından scan isminde değerini System içinden alan bir obj.

        // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");

        System.out.println("adınızı giriniz :");

        // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.

        String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        System.out.println("isim = " + isim);
    }
}
