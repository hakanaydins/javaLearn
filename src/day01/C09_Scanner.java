package day01;

import java.util.Scanner;

public class C09_Scanner {

    //  Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin (pi =3.14)
    //  Kullanicidan ismini ve soyismini alip aralarinda bir bosluk olusturarak asagidaki sekilde yazdirin
    //  Isim – soyisim : Elly Dainty
    //  Kullanicidan ismini alip isminin bas harfini yazdirin.

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);
      //System.out.println("çemberin yarıçapını giriniz : ");
      //double yarıcap = scan.nextDouble();

      //System.out.println("yarıcap = " + yarıcap);
      //System.out.println("çemberin cevresi = " + 2*3.14*yarıcap);
      //System.out.println("dairenin alanı = " + 3.14*yarıcap*yarıcap);


        System.out.println("lutfen isminizi giriniz : ");
        String isim = scan.nextLine();

        System.out.println("lutfen soyisminizi giriniz :");
        String soyIsim = scan.nextLine();

        System.out.println("isim -soyisim  :" + isim + " " +soyIsim );


    }



}
