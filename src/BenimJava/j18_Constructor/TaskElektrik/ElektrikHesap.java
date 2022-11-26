package BenimJava.j18_Constructor.TaskElektrik;

public class ElektrikHesap {

    //field
    int toplamTuketim;
    double oran=0.7;
    double fatura;

    public ElektrikHesap() {
    }

    public ElektrikHesap(int toplamTuketim, double fatura) {
        this.toplamTuketim = toplamTuketim;
        this.fatura = fatura;
    }

    public int tuketimEkle(int tuketim) {
        toplamTuketim += tuketim;
        return toplamTuketim;
    }

    public double odenecekTutar() {
        fatura=toplamTuketim*oran;
        return fatura;
    }

    @Override
    public String toString() {
        return "ElektrikHesap{" +
                "toplamTuketim=" + toplamTuketim +
                ", fatura=" + fatura +
                '}';
    }
}
