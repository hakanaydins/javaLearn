package BenimJava.j34_Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task01 {

    //task -> Verilen bir integer listin tek  elemanrının karesini tersten iteartor  print eden code create ediniz

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(23,32,4,5,6,54,33,3));
        ListIterator<Integer> it1=list.listIterator();
        while (it1.hasNext()){
            int num=it1.next();
            if (num%2==1){
                it1.set(num*num);
            }else{
                it1.remove();
            }

        }
        System.out.println(list);
        while (it1.hasPrevious()){
            System.out.print(it1.previous()+",");
        }
        System.out.println("  ");
        System.out.println(list);
    }
}
