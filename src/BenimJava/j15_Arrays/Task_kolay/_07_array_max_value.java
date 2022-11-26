package BenimJava.j15_Arrays.Task_kolay;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

    int sayi[]={12,2,5,15,8};
    Arrays.sort(sayi);
        System.out.println(sayi[sayi.length-1]);



    }
}

