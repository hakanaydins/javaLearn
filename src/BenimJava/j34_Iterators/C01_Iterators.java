package BenimJava.j34_Iterators;

import java.util.*;

public class C01_Iterators {

    public static void main(String[] args) {

        List<String> l1 =new ArrayList<>(Arrays.asList("Nur","Gamze","Erol","Bekir"));
        System.out.println("l1 List ilk hali: "+l1); // [Nur, Gamze, Erol, Bekir]

        // l1 elemanlarini forLoop ile print ediniz...

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i)+" "); // Nur Gamze Erol Bekir
        }
        System.out.println();

        // l1 elemanlarini for-each loop ile print ediniz...
        for (String w:l1) {
            System.out.print(w+" "); //Nur Gamze Erol Bekir
        }
        System.out.println();

        // l1 herbir elemani :-) forloop ile update edip print ediniz...
        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i)+":-) ");
        }
        System.out.println("l1 update sonrasi: "+l1); //[Nur:-) , Gamze:-) , Erol:-) , Bekir:-) ]

        // l1 herbir elemani :-) for-each loop ile update edip print ediniz...
        for (String x:l1) {
            x +=":-(";
        }
        System.out.println("l1 for-each loop update sonrasi: "+l1); // [Nur:-) , Gamze:-) , Erol:-) , Bekir:-) ]

        /*
        index desteklemeyen yapilarda tekrarlayan aksiyon icin for-each loop update yapamayabilir.
        Yukaridaki taskde oldugu gibi
        Bu durumda java iterator interface`den tanimlanacak variable ile tekrarlayan aksiyonlar index olmadan yapilir.
         */
        System.out.println("\n*** iterator ***");

        Iterator<String> it1=l1.iterator(); // Iterator interface`den it1 variable tanimlandi. Atama olarak l1 elemanlari atandi
        // it1.hasNext()->it1 elemanlari icin pointer oldugu yerde eleman varsa true yoksa false verir ve pointer bir sonraki eleman onune gelir.
        // it1.next() -> list`in pointer onundeki elemanini return eder.

        while (it1.hasNext()){
            System.out.print(it1.next() + " "); // Nur:-)  Gamze:-)  Erol:-)  Bekir:-)
        }

        System.out.println("\n\n*** 2. List Tasks ***");
        List<String> l2 =new ArrayList<>(Arrays.asList("Baran","Gulsum","Akif","Nazim"));
        System.out.println("l2 List ilk hali: "+l2); // [Baran, Gulsum, Akif, Nazim]

        // l2 elemanlarini iterator ile silip print ediniz.
        Iterator<String> it2=l2.iterator();

        while (it2.hasNext()){ // tekrardaki pointer onunde eleman varligini kontrol eder
            it2.next(); // tekrardaki pointer onundeki elemani verir
            it2.remove(); // next() methodu ile getirilen elemnai siler
        }
        System.out.println("iterator ve remove sonrasi l2: "+l2); // []

        System.out.println("\n*** 3. List Tasks ***");
        List<String> l3 =new ArrayList<>(Arrays.asList("Baran","Gulsum","Akif","Nazim"));

        // l3 elemanlarini iterator ile :-) set edip print ediniz. -> [Baran:-), Gulsum:-), Akif:-), Nazim:-)]
        System.out.println("ListIterator oncesi l3: "+l3);

        ListIterator<String>it3=l3.listIterator();// ListIterator yapisi tanimlandi

        while (it3.hasNext()){
            it3.set(it3.next()+":-) "); // tekrardaki next() ile elemani :-) concat ederek update edildi
        }

        System.out.println("ListIterator set sonrasi l3: "+l3); // [Baran:-) , Gulsum:-) , Akif:-) , Nazim:-) ]


        System.out.println("\n*** 4. List Tasks ***");
        List<String> l4 =new ArrayList<>(Arrays.asList("Serhat","Yakup","Mustafa","Nazli"));
        System.out.println("ListIterator oncesi l3: "+l3);

        // l3 elemanlarinin ilk harfi buyuk kalan 3 harfi *** karakteri ve l4 listi ekleyip print ediniz

        ListIterator<String> ebikGabik = l3.listIterator();

        while (ebikGabik.hasNext()){
            ebikGabik.set(ebikGabik.next().toUpperCase().charAt(0)+"***"); // next()`le l4 elemanlarinin ilk harf buyuk, kalan 3 harf *** ile set edildi
            ebikGabik.add(l4.toString()); // tekrardaki update edilen l3`e l4 add edildi
        }

        System.out.println("ListIterator set ve add sonrasi l3: "+l3);
        //[B***, [Serhat, Yakup, Mustafa, Nazli], G***, [Serhat, Yakup, Mustafa, Nazli], A***, [Serhat, Yakup, Mustafa, Nazli], N***, [Serhat, Yakup, Mustafa, Nazli]]






    }
}
