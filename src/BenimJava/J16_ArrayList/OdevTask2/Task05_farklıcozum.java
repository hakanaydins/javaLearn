package BenimJava.J16_ArrayList.OdevTask2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05_farklıcozum {
    public static void main(String[] args) {

        /*TASK :
    2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
    listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
    Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

    */
        String [][] str=  {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        List<String> name=new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                name.add(str[i][j]);
            }
        }
        Collections.sort(name);
        System.out.println(name);


    }
}
