package BenimJava.j13_Break_Continue.HaftanınTasks;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */



        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayı giriniz ");
        int num = scan.nextInt();// bunu sor
        System.out.println(powerOfTwo(num));
    } // main dışı
    public static boolean powerOfTwo(int num) {

        int count = 0;
        for (int i = 1; i < num; i *= 2) {
            if ((num % i != 0))
                count++;
        }
        return count == 0;
    }
    }


