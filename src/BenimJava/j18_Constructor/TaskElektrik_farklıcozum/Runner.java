package BenimJava.j18_Constructor.TaskElektrik_farklıcozum;

public class Runner {
    public static void main(String[] args) {

        ElektrikHesap hesap = new ElektrikHesap();

        Musteri m1 = new Musteri("orhan",hesap);

    hesap.tüketimEkle(200);
    hesap.odenecekTutar();

        System.out.println("m1.elekrikObjesi.fatura = " + m1.elekrikObjesi.fatura);

        System.out.println(m1);
    }


}
