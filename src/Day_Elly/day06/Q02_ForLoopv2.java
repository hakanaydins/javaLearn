package Day_Elly.day06;

public class Q02_ForLoopv2 {
    public static void main(String[] args) {

    //Interview Question
    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        System.out.println("*** For ***");
        int i=0;
        for (i=0;i<255;i++){
            System.out.print(i);
            System.out.print((char)i);
        }
        System.out.println();

        System.out.println("*** While ***");
        int k=0;

        while (k<255){
            System.out.print(k);
            System.out.print((char)k);
            k++;
        }
        System.out.println("*** Do While ***");
        int t=0;
        do {
            System.out.print(t);
            System.out.print((char)t);
            t++;

        }while (t<=255);
        

    }


    }

