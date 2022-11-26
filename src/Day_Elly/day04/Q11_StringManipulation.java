package Day_Elly.day04;

import java.util.Scanner;

public class Q11_StringManipulation {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("isminizi giriniz : ");
        String isim = sc.nextLine();


        System.out.print("soyisminizi giriniz : ");
        String soyIsım = sc.nextLine();

        if(isim.length()>soyIsım.length()){
            System.out.println("isim kelimesi uzun");
        }else System.out.println("soyisim kelimesi uzun");
    }
}