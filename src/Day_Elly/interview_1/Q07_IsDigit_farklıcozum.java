package Day_Elly.interview_1;

import java.util.Arrays;

public class Q07_IsDigit_farklıcozum {
    /*
 Create a method that accepts a String as parameter and finds the sum of digits in that String.
 Example:
 input : J4\/4 1$ 34$¥
 output : 16

 Hint:
 Character.isDigit()
 Integer.valueOf()
*/
    public static void main(String[] args) {

        String s = " J4\\/4 1$ 34$¥";
        sayılar(s);
    }

    public static void sayılar(String s) {
        String yeni = s.replaceAll("\\D", "");
        String arr[] = yeni.split("");
        System.out.println(Arrays.toString(arr));
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += Integer.valueOf(arr[i]);
        }
        System.out.println("toplam = " + toplam);


    }
}
