package BenimJava.j18_Constructor.TaskElektrik;

public class Runner {
    public static void main(String[] args) {


        ElektrikHesap obj1 = new ElektrikHesap();
        //obj1.tuketimEkle(150);
        //obj1.tuketimEkle(200);

        //System.out.println("obj1.odenecekTutar() = " + obj1.odenecekTutar());
        //
        //System.out.println("obj1.toplamTuketim = " + obj1.toplamTuketim);

        Musteri musteri= new Musteri("Hakan",obj1);

        musteri.name="Hakan";
        musteri.elk.tuketimEkle(200);
        musteri.elk.tuketimEkle(100);
        System.out.println("musteri.elk.odenecekTutar() = " + musteri.elk.odenecekTutar());

        Musteri musteri2= new Musteri("Enise",new ElektrikHesap());

    }

}
