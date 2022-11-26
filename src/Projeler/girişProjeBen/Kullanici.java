package Projeler.girişProjeBen;


import java.time.LocalDateTime;

public class Kullanici {

    String name;
    LocalDateTime kayitZamanı;

    public Kullanici(String name, LocalDateTime kayıtZamanı) {
        this.name = name;
        this.kayitZamanı = kayıtZamanı;
    }

    @Override
    public String toString() {
        return "Kullanici{" +
                "name='" + name + '\'' +
                ", kayitZamanı=" + kayitZamanı +
                '}';
    }
}

