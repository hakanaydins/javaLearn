package BenimJava.j13_Break_Continue.HaftanınTasks;

import java.util.Scanner;

public class T01_TopZıplamaMesafeSaysı {

   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yolu giriniz : ");
        int zıpSayac = 0;
        double h = scanner.nextDouble();
        double tYol = h;
        // h= h*0.75;
        do {
            h = h * 0.75;
            tYol += h * 2;
            zıpSayac++;
        } while (h > 1);
        System.out.println("Topun aldigi toplam yol : " + tYol);
        System.out.println("Topun yere vurma sayisi : " + zıpSayac);


    }
}
