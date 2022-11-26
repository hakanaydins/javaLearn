package BenimJava.j18_Constructor.Z01_Bike;

public class Z01_Bike {
    public static void main(String[] args) {


        Z01_BikePOJO pinokyo1 =new Z01_BikePOJO("D500","mavi",7000,25);

        //System.out.println("pinokyo1.marka = " + pinokyo1.marka);
        //pinokyo1.renk="kırmızı";
        //pinokyo1.fiyat=5000;
        //pinokyo1.vites=18;
        //pinokyo1.elektrikliMi=false;
        //pinokyo1.vites=21;
        //pinokyo1.marka="t2o3";
        //System.out.println("pinokyo1.marka = " + pinokyo1.marka);

        Z01_BikePOJO pinokyo2 =new Z01_BikePOJO();
        //System.out.println("pinokyo2.vites = " + pinokyo2.vites);
        //System.out.println(pinokyo1.marka + pinokyo1.renk + pinokyo1.fiyat);

        System.out.println("pinokyo1 = " + pinokyo1);
        System.out.println("pinokyo2 = " + pinokyo2);

        Z01_BikePOJO pinokyo3 =new Z01_BikePOJO("ty300","sarı");
        System.out.println("pinokyo3 = " + pinokyo3);

    }// main dışı




}

