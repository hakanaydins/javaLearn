package day01;

public class C07_Converting {

    /*
   galonu litreye ceviren bir java programi yaziniz
       1 gallon = 3.785 litre
   litreyi galona ceviren bir java programi yaziniz
       1 litre = 1/3.785 gallon

   //  Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın. (Scanner class)
   // formül
   // c = (f-32)*5/9
*/
    public static void main(String[] args) {

        int gallon=1000;
        double
        liters=gallon*3.785;
        String result1=gallon + "gallon deger "+ liters + " liredir";
        System.out.println("result1 = " + result1);



        double litre = 100;
        double galon = litre/3.785;
        String result2 = litre + "litre değeri" + "galona eşittir;";
        System.out.println("result = " + result2);


    }

}
