package Projeler.girişProjeBen;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {


        
        Kayit KayitliOgrenciler=new Kayit();
        ArrayList<Kullanici> listOgrenci=KayitliOgrenciler.kayitAl();
        KayitliOgrenciler.printHappyUser(listOgrenci);
    }


}
