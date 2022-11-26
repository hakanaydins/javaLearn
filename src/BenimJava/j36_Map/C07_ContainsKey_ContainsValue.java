package BenimJava.j36_Map;

import java.util.HashMap;

public class C07_ContainsKey_ContainsValue {
    public static void main(String[] args) {


        HashMap<String, String> hm = new HashMap<>();
        //map.ContainsKey();--> Girilen key değerinin mapde varlığını kontrol eder. boolean return eder.
        //map.ContainsValue();--> Girilen value değerinin mapde varlığını kontrol eder. boolean return eder.


        hm.put("Amazon", "296 Euro");
        hm.put("Ebay", "234 Euro");
        hm.put("Saturn", "300 Euro");
        hm.put("Vatan", "111 Euro");
        hm.put("Apple store", "333 Euro");
        hm.put("MediaMarkt", "183 Euro");

        System.out.println("hm" + hm);//hm{Saturn=300 Euro, Ebay=234 Euro, Apple store=333 Euro, MediaMarkt=183 Euro, Amazon=296 Euro, Vatan=111 Euro}

        System.out.println("-------*****------");

        System.out.println("hm.containsKey(\"amazon\") = " + hm.containsKey("amazon"));//false
        System.out.println("hm.containsKey(\"Amazon\") = " + hm.containsKey("Amazon"));//true

        System.out.println("hm.containsValue(\"296 Euro\") = " + hm.containsValue("296 Euro"));//true
        System.out.println("hm.containsValue(\"ebik gabık euro\") = " + hm.containsValue("ebik gabık euro"));//false


    }

}
