package Day_Elly.interview_1;

public class Q07_IsDigit {
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


        String inputt ="J4\"/4 1$ 34#Y";
        int toplam=0;
        String character="";
        String sembol="";
        for (int i = 0; i < inputt.length(); i++) {
            if (Character.isDigit(inputt.charAt(i))){
                toplam+=Integer.valueOf(""+inputt.charAt(i));

            } else if (Character.isAlphabetic(inputt.charAt(i))) {

                character+=inputt.charAt(i);
            }
            else {
                sembol+=inputt.charAt(i);

            }

        }
        System.out.println("toplam = " + toplam);
        System.out.println("character = " + character);
        System.out.println("sembol = " + sembol);

    }
}
