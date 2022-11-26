package BenimJava.j32_Abstract.Ornek3_v1;

public class YemekDunyasiMain {
    public static void main(String[] args) {


        Baklava bklv = new Baklava();
        bklv.madeIn();
        bklv.taste();

        CheeseCake chc = new CheeseCake();
        chc.madeIn();
        chc.taste();

        SezarSalad sld = new SezarSalad();
        sld.madeIn();
        sld.taste();
    }
}
