package BenimJava.j15_Arrays.Task_kolay;

import java.util.Arrays;

public class _12_Array_no14_farklıcozum {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */



        int num []={1,2,3,4};
        boolean result;
        if (Arrays.binarySearch(num,1)>=0 && Arrays.binarySearch(num,4)>=0){
            result=false;
        }else result=true;
        System.out.println("result = " + result);

    }
}