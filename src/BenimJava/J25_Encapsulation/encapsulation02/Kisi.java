package BenimJava.J25_Encapsulation.encapsulation02;

public class Kisi {//pojo class

    /*
	 tüm özellikleri kullanıcı görebilmeli ve update edilmeli
	 password encapsulated update edilmemeli, yas negatif değer girmeye karşı encapsulated
	 */


   //field
   String ad;
    String soyad;
    private int yas;
    private String password;

    public Kisi(String ad, String soyad, int yas, String password) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.password = password;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas<0) {
            this.yas=yas*(-1);

        } else this.yas=yas;
        //this.yas = Math.abs(yas);//parametre gelen yas - den kurtularak ins. var atandı
    }

    public String getPassword() {
        return password;
    }



}
