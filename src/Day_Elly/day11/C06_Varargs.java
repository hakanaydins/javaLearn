package Day_Elly.day11;

public class C06_Varargs {
    public static void main(String[] args) {


        // Create a multiply method with double varargs (return double)

        System.out.println(multiply(1.5,2.2,1,5.1,6.5));
    }
    private static double multiply(double ... sayi) {
        int carp=1;
        for (double w:sayi) {
            carp*=w;
        }
        return carp;
    }
}
