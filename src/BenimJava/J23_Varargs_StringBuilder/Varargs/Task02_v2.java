package BenimJava.J23_Varargs_StringBuilder.Varargs;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02_v2 {
    public static void main(String[] args) {

/*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.
         */

        ArrayList<Integer> sayi  =new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while  (sc.nextInt()!=0) {
            sayi.add(sc.nextInt());
        }
        Integer []arr=sayi.toArray(new Integer[0]);
        System.out.println("hesapla(sayi) = " + hesapla(arr));
    }  //main sonu
    public static int hesapla(Integer... sayilar) {
        int x = 0;
        for (int i = 1; i < sayilar.length; i++) {
            x += sayilar[i];
        }
        x *= sayilar[0];
        return x;
    }

    }



