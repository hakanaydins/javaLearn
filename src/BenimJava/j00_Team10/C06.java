package BenimJava.j00_Team10;

import java.util.Arrays;

public class C06 {

    public static void main(String[] args) {

        ortalama("sena",23,56,78,93,49);
        ortalama("rana",23,56);

    }
    public static int ortalama(String isim, int ...sayi){
        int toplam=0;

        for(int a:sayi){
            toplam+=a;
        }
        System.out.println(isim+" "+toplam/sayi.length);

        return toplam;

    }
}
