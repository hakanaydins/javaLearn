package BenimJava.j19_StaticVariable.Task;

import java.util.Scanner;

public class Tasks04_BisikletRunner {

    /*
   Task 04->
    Bisiklet Class :Properties(fields) : hiz, vites
    method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
    vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
    vites 5 den büyük ve 1 den küçük olamaz.
    yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
   Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
    */
    public static void main(String[] args) {

        Tasks04_Bisiklet bike1 = new Tasks04_Bisiklet();
        Scanner sc = new Scanner(System.in);

        System.out.println("hangi işemi yapmak istersiniz: 1-Hız Değiştir 2-Vites artır 3-Vites Azalt 4- Durum goster ");

        int işlem = sc.nextInt();

        /* switch (işlem) {
            case 1:
                hızdegistir();
                break;
            case 2:
                vitesartir();
                break;
            case 3:
                vitesazalt();
                break;
            case 4:
                durumgoster();
                break;

         */




        }


    }




