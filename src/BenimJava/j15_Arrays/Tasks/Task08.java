package BenimJava.j15_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        int arr []= {13,45,98,56,78,10,15};

        int sayac=0;

        for (int i = 0; i <= arr.length-1; i++) {

            if (arr[i]%2!=0){
                System.out.print(arr[i]+" ");
                sayac++;
            }
        }

        System.out.println("\ntek sayi adedi: "+sayac);


    }

}
