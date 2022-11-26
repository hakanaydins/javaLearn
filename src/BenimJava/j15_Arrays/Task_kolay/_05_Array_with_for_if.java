package BenimJava.j15_Arrays.Task_kolay;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
         elemanları : 5,6,8,12,14,19 olan int Array oluşturun ve
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        int sayiArr1[]={ 5,6,8,12,14,19};

        int toplam=0;

        for (int i = 0; i < sayiArr1.length; i++) {

            if (sayiArr1[i]%2==0){
                toplam+=sayiArr1[i]; // +6+8+12+14  =40
            }else {
                toplam-=sayiArr1[i]; // -5 -19 = -24
            }
        }
        // toplam -5 +6 +8 +12 +14 -19 =16
        System.out.println("toplam= " + toplam); // 16


    }
}
