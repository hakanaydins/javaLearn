package BenimJava.j00_Team10;

public class C01 {
    public static void main(String[] args) {
        //Soru 1) iki String array olusturunuz ve bu array'lerdeki ortak elemanlari For-each loop kullanarak bulunuz.
        // Sonucu ekrana yazdiriniz. Ortak eleman yoksa ekrana "Ortak eleman yok" yazdiriniz.

        String[] array = {"Tim 10 dayız", "Enise", "yunus"};
        String[] array1 = {"Hakan", "Merve", "orhan", "Enise"};

        int count = 0;
        for (String ortak : array) {
            for (String ortak2 : array1) {
                if (ortak2.equals(ortak)) {
                    count++;
                    System.out.println(ortak);
                }
            }
        }
        if (count == 0) {
            System.out.println("ortak eleman yok");
        }


    }
}
