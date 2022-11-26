package BenimJava.j00_Team10;

import java.util.Arrays;

public class C10_bak {
    public static void main(String[] args) {
        // bir arrayın tersten yazdırma
        int ar[]={20,30,40,4,6,89,56,45};
        int ters[]={ar.length};

        for (int i=ar.length;i>0;i--) {
            ters[i]=ar[i];
        }
        System.out.println(Arrays.toString(ters));
    }
}
