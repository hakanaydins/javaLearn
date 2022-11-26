package BenimJava.j32_Abstract.Ornek2_v2;

public abstract class SekilClass {
    private String name;

    public SekilClass() { // parametresiz Constructor
    }

    public SekilClass(String name) { // parametreli Constructor
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla ();
    public abstract double cevreHesapla ();
    //public void ciz() {
    //    System.out.println(this.name+" sekli cizildi");
    //}

    public String ciz() {

        return this.name+" sekli cizildi";
    }
    @Override
    public String toString() { // obje value`larini print eder.
        return  "Sekil ismi: " + this.name+
                "\nSekil alani: "+this.alanHesapla()+
                "\nSekil cevre: "+this.cevreHesapla()+
                "\n"+this.ciz(); // ciz methodu call edildi.
    }
}
