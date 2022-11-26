package BenimJava.J26_Inheritance.Inheritance01;

public class Kedi extends Mammal{// Mammıl parent class Mammıl child-torun
    /*
    Child class obj olmadan parent clas variable ve methodlara ulasilabilir.

     */
    public Kedi(){// p.siz cons.
        System.out.println(" ahanda kedi p.siz cons..");

    }
    public void cırmala() {
        System.out.println("kedi fena cırmalar miyavlar .");
    }

}
