package BenimJava.j00_Team10;

import java.util.Arrays;

public class C03 {
    public static void main(String[] args) {

        /*     'Soru 3) Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin toplam'ni  birer birer
    bulan ve herbi' sonucu yeni bir array'in elemani yapan ve yeni array'i  ekrana  yazdiran bir program yaziniz.
        { {1,2,3}, {4,5}, {6,7} }
        Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output:'{6, 9, 13}*/

        int toplam = 0;
        int arr[][] = {{1, 2, 3}, {4, 5}, {6, 7}};
        int aryeni[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam += arr[i][j];
            }
            aryeni[i] = toplam;//burada yazmamızın sebebi içleri toplasın diye
            toplam = 0;//burası toplamı sıfırlar.yeniden toplasın diye. yoksa hepsini üst üste toplar
        }
        System.out.println(Arrays.toString(aryeni));


    }
}
