package BenimJava.j12_Loops.L02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
Task-> girilen sayıların toplamı 333 gectiğinde girilen sayı adedini ve toplamını prşnt eden code create ediniz.
 */



        Scanner sc=new Scanner(System.in);
        System.out.println("sayı girin");

        int toplam=0;
        int sayac=0;

        while(toplam<=333){
            int sayi=sc.nextInt();
            sayac++;
            toplam+=sayi;
           // toplam=toplam+sayi;

                  }
        System.out.println(toplam);
        System.out.println(sayac);






    }
}
