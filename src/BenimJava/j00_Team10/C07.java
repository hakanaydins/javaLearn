package BenimJava.j00_Team10;

public class C07 {
    public static void main(String[] args) {

        //   Write a Java program to count the number of even and odd elements in a given array of integers.


        int [] num = {3,4,1,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,9,3,5,6,8,6,8,9,3,5,6,8,6,8,9,3,5,6,8};

        int cift=0;
        int tek=0;

        for (int i = 0; i <num.length ; i++) {

            if(num[i]%2==0){
                cift++;
            }else {
                tek++;
            }

                    }
        System.out.println("tek sayı adedi:" + tek);
        System.out.println("çift sayı adedi:" + cift);






    }
}
