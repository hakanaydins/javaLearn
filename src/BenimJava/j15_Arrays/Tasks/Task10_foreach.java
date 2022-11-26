package BenimJava.j15_Arrays.Tasks;

import java.util.Arrays;

public class Task10_foreach {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */

        int arr[] = {1, 2, -3, 4, -5, -6};

        syınınTersi(arr);
    }

    private static void syınınTersi(int[] arr) {

        for (int a:arr){
            a*=-1;
            System.out.print(a+" ");
        }

    }
}


