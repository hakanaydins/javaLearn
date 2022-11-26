package Day_Elly.day04;

import java.util.Scanner;

public class Q08_StringManipulation {

    /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("1.kelimeyi giriniz : ");
        String kelime1 = sc.nextLine();


        System.out.print("2.kelimeyi giriniz : ");
        String kelime2 = sc.nextLine();

        if (kelime1.length() % 2 == 0) {
            System.out.println(kelime1.substring(0, kelime1.length() / 2) + kelime2 + kelime1.substring(kelime1.length() / 2));
        } else {
            System.out.println("kelime2 kelime1 eklenemez");


        }
    }
}
