package Projeler.girişProjeBen;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Kayit {

    ArrayList<Kullanici> kullaniciListesi = new ArrayList<>();

    public ArrayList<Kullanici> kayitAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı giriniz:");
        String ad = scan.nextLine();

        Kullanici Obj1 = new Kullanici(ad, LocalDateTime.now());
        kullaniciListesi.add(Obj1);
        return kullaniciListesi;
    }

    public void printHappyUser(ArrayList<Kullanici> kullaniciListesi) {
        for (Kullanici w : kullaniciListesi) {
            if (w.kayitZamanı.getSecond()<=10){
                System.out.println("Şanslı kullanıcımız:"+w.name);
            }else{
                System.out.println("malesef:"+w.name);
            }

        }


    }


}
