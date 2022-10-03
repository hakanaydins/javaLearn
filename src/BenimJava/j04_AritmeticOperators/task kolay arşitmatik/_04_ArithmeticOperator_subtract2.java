import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */


    }

    public static class Task09 {


        /*
         Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
         Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

         */

        public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
            System.out.print("Çiftlikteki inek sayısını giriniz : ");
            int inek= input.nextInt();
            System.out.print("Çiftlikteki koyun sayısını giriniz : ");
            int koyun= input.nextInt();
            System.out.print("Çiftlikteki tavuk sayısını giriniz : ");
            int tav= input.nextInt();
            System.out.println("Çiftlikteki hayvanların ayaklarının toplam sayısı = "+((inek+koyun)*4+tav*2));



        }

    }
}
