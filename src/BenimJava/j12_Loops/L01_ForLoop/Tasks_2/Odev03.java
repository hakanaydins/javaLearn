package BenimJava.j12_Loops.L01_ForLoop.Tasks_2;

import java.util.Scanner;

import static java.lang.System.in;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.println(asalhesap(sayi));

        if (asalhesap(sayi) == true) {
            System.out.println("Girdiginiz sayi asal sayidir");
        } else System.out.println("Asal sayi degildir");}
    public static boolean asalhesap(int sayi) {
        boolean sonuc = false;
        int dongu = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                dongu++;}}
        if (dongu == 0) {sonuc = true;}
        return sonuc;}
}




