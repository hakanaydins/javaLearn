package BenimJava.j15_Arrays.Task_kolay;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str="Hello World";

        String strArr []= str.split("");

        // System.out.println(Arrays.toString(strArr));

        for (int i = strArr.length-1; i >=0 ; i--) {
            System.out.print(strArr[i]); //dlroW olleH

    }
}
    }