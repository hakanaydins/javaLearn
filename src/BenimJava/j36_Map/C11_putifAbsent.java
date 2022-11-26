package BenimJava.j36_Map;

import java.util.HashMap;

public class C11_putifAbsent {
    public static void main(String[] args) {


        HashMap<String, String> hm = new HashMap<>();
        //map.putifAbsent();--> Girilen key  mapde yoksa entry(key,value)mape ekler ve null return eder.
        //Girilen key  mapde var ise key'e ait value  return eder.


        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm" + hm);//hm{Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}
        System.out.println("-------*****------");

        System.out.println("hm.putIfAbsent(\"ebik\",\"Gabık\") = " + hm.putIfAbsent("ebik", "Gabık"));//null

        System.out.println("hm.putIfAbsent(\"Ebay\", \"javaNaz\") = " + hm.putIfAbsent("Ebay", "javaNaz"));//234 Euro
                    //Ebay keyde olduğu için ebay keye ait value 234 euro return edildi.

        System.out.println("hm" + hm);//hm{ebik=Gabık, Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

    }
}


