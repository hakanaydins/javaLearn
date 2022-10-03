package BenimJava.j06_Comparison_Karsılastırma_Pperators;

public class C01_Comparation {
    public static void main(String[] args) {
    /*

    ==     Esit               x == y
    !=     Esit degil         x != y
    >      buyuk              x > y
    <      kucuk              x < y
    >=     buyuk esit         x >= y
    <=     kücük esit         x <= y

    */
        int slmYs=33;
        int krmYs= 41;
        System.out.println("krm b esit mi slm b -> "+(krmYs==slmYs));//false
        System.out.println("krm b esit değil  mi slm b -> "+(krmYs!=slmYs));//true
        System.out.println("krm b kucuk mu  slm b -> "+(krmYs<slmYs));//true
        System.out.println("krm b buyuk mu   slm b -> "+(krmYs>slmYs));//true
    }
}
