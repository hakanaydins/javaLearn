package BenimJava.j00_Team10;

public class C02 {
    public static void main(String[] args) {


        // 'Soru 2) Bir integer array olusturunuz ve bu array'deki
        // tum sayilarin carpimini For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazd'riniz.

        int[] arr = {1, 3, 5, 6};
        int carpim = 1;
        // 1.yol
        for (int w : arr) {
            carpim *= w;
        }
        // 2.yol
        int carpim2 = 1;
        for (int i = 0; i < arr.length; i++) {
            carpim2 *= arr[i];
        }
        System.out.println("carpim : " + carpim);
        System.out.println("carpim2 : " + carpim2);
    }
}
