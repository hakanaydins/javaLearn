package BenimJava.j18_Constructor.TaskElektrik;

public class Musteri {

//field
    String name;
    ElektrikHesap elk;

    public Musteri(String name, ElektrikHesap elk) {
        this.name = name;
        this.elk = elk;

    }

    @Override
    public String toString() {
        return "Musteri{" +
                "name='" + name + '\'' +
                ", elk=" + elk +
                '}';
    }
}
