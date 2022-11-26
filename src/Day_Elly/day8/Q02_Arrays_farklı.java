package Day_Elly.day8;

public class Q02_Arrays_farklı {
    public static void main(String[] args) {

        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)

         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        double toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        double ort = toplam / arr.length;
        System.out.println("ort = " + ort);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] > ort ? arr[i] + " " : "");

        }
    }
}
