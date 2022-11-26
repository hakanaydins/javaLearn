package BenimJava.j18_Constructor.TaskElektrik_farklıcozum;

public class Musteri {
    String name;

    ElektrikHesap elekrikObjesi;// elektrik hesabı class hesabı


    public Musteri(String name, ElektrikHesap elekrikObjesi) {
        this.name = name;
        this.elekrikObjesi = elekrikObjesi;
    }

    public Musteri() {
    }

    @Override
    public String toString() {
        return "Musteri{" +
                "name='" + name + '\'' +
                ", elekrikObjesi=" + elekrikObjesi +
                '}';
    }



}


