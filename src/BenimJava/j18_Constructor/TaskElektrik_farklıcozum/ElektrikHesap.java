package BenimJava.j18_Constructor.TaskElektrik_farklıcozum;

public class ElektrikHesap {

    int toplamTuketim;
    double oran=0.7;
    double fatura;

    public ElektrikHesap(int toplamTuketim, double fatura) {
        this.toplamTuketim = toplamTuketim;
        this.fatura = fatura;
    }

    public ElektrikHesap() {
    }

    @Override
    public String toString() {
        return "ElektrikHesap{" +
                "toplamTuketim=" + toplamTuketim +
                ", fatura=" + fatura +
                '}';
    }

    public void tüketimEkle(int tüketilenenerji ){

        toplamTuketim+=tüketilenenerji;

    }

    public void odenecekTutar( ){

        fatura=toplamTuketim*oran;
        System.out.println("fatura bedeli: "+fatura);

    }
}

