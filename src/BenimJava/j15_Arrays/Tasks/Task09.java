package BenimJava.j15_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        int sayiArr []  = new int [5];

        for (int i = 0; i < sayiArr.length; i++) {
            System.out.print(i+". elemanı giriniz : ");
            sayiArr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(sayiArr));
        int tersArr [] = new int [sayiArr.length];
        for (int i = 0; i < tersArr.length; i++) {
            tersArr[i] = sayiArr[sayiArr.length -1-i];
        }
        System.out.println(Arrays.toString(tersArr));



    }
}
