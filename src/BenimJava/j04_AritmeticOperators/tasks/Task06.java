package BenimJava.j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         */

        Scanner input= new Scanner(System.in);

        System.out.print("üç basamaklı bir sayi giriniz : ");
        int sayi= input.nextInt();
        System.out.println("Girdiginiz sayinin birler basamagi :"+(sayi%10));
        System.out.println("Girdiginiz sayinin onlar basamagi :"+((sayi/10)%10));
        System.out.println("Girdiğiniz sayının yüzler basamağı : "+(sayi/100));

    }
}
