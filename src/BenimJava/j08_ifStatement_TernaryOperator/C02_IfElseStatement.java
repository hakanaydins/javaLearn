package BenimJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_IfElseStatement {
    public static void main(String[] args) {

    /*
        Task01
           girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("agam bir sayi gir : ");
        int sayi = sc.nextInt();

        if (sayi > 0) {//sayinin sıfırdan buyuk olması şarta baglandı
            System.out.println("girilen sayi pozitif");
        } else if (sayi < 0) {//sayinin sıfırdan buyuk olmaması halinde sıfırdan kucuk olamsı sarta baglandı
            System.out.println("girilen sayi negatif");
        } else {//sayının sıfırdan buyuk veya kucuk olmaması halıinde kalan durum(sıfıra eşit olması) şarta bağlandı
            System.out.println("girilen sayi ne negatif  ne de pozitifdir yani nötr'dür");
        }



    }
}
