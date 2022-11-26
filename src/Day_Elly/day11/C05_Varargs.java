package Day_Elly.day11;

public class C05_Varargs {
    public static void main(String[] args) {

        // istedigimiz kadar sayi girdigimizde
        // toplamlari bize veren bir method yazalim...

        sumAll(5, 9, -12, 0, 100, 8,5,5,6);
    }
    private static void sumAll(int... sayi) {

        int toplam = 0;
        for (int each : sayi) {
            toplam += each;
        }
        System.out.println("toplam = " + toplam);
    }
}
