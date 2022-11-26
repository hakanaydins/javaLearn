package Day_Elly.interview_1;

import java.util.Scanner;

public class Q03_PrimeNumber_farklı {
    public static void main(String[] args) {

        /*
        Ask user enter a positive number and check if it is prime or not
        Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();
        scan.close();
        int count=0;
        for (int i = 1; i <=sayi; i++) {
            if(sayi%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Girdiginiz sayi asal sayidir");
        }else System.out.println("Girdiginiz sayi asal sayi degildir");
    }
}
