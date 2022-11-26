package BenimJava.j00_Team10;

import java.util.ArrayList;

public class C9 {
    public static void main(String[] args) {

        //     Write a Java program to rearrange all the elements of an given array of integers so that
        //    all the odd numbers come before all the even numbers.

        int[] num = {3, 4, 1, 6, 8, 9, 3, 5, 6, 8, 9, 3, 5, 6, 8, 9, 3, 5, 6, 8, 9, 3, 5, 6, 8, 9, 3, 5, 6, 8, 9, 3, 5, 6, 8, 9, 3, 5, 6, 8, 6, 8, 9, 3, 5, 6, 8, 6, 8, 9, 3, 5, 6, 8};


        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 != 0) {

                sayilar.add(num[i]);
            }
        }
        System.out.println("tekler: " + sayilar);

        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0) {

                sayilar.add(num[i]);
            }
        }
        System.out.println("sayilar = " + sayilar); 
    }
}
