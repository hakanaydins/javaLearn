package day04;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminiiz ve soyisminizi giriniz :");
        String firstName = scan.nextLine(), lastName = scan.nextLine();

        String fulName = firstName.concat(" " + lastName).toUpperCase();
        System.out.println("fulName = " + fulName);

    }







}
