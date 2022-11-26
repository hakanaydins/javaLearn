package Day_Elly.interview_1;

import java.util.Scanner;

public class Q03_PrimeNumber_farklı2 {
    public static void main(String[] args) {

        /*
        Ask user enter a positive number and check if it is prime or not
        Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı yazınız ");
        int sayi = Math.abs(scan.nextInt());
        boolean flag = true;
        if (sayi == 1) {
            System.out.println("asal sayılar 2 den başlar");
        } else {

            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    flag = true;
                    break;
                } else flag = false;
            }
            if (flag == true) System.out.println("number is prime number");
            else if (flag == false) System.out.println("number is not prime number");
        }
    }
}
