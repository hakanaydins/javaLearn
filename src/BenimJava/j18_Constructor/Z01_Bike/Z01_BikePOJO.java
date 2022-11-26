package BenimJava.j18_Constructor.Z01_Bike;

public class Z01_BikePOJO {
    // field

    String marka="bissan";
    String renk;
    int fiyat;
    int vites;
    boolean elektrikliMi;


    public Z01_BikePOJO(String marka, String renk, int fiyat, int vites) {
        this.marka = marka;
        this.renk = renk;
        this.fiyat = fiyat;
        this.vites = vites;
    }

    public Z01_BikePOJO() {
    }

    public Z01_BikePOJO(String marka, String sarı) {
        this.marka=marka;
        this.renk=sarı;
    }


    @Override
    public String toString() {
        return "Z01_BikePOJO{" +

                ", renk='" + renk + '\'' +
                ", fiyat=" + fiyat +

                ", elektrikliMi=" + elektrikliMi +
                '}';
    }
}

