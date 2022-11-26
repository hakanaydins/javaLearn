package BenimJava.j15_Arrays.Tasks;

import java.util.Arrays;

public class Task03_Farklıcozum {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

		int sayiArr[]= {1,2, 3};
		int sayiArr1[]=new int [sayiArr.length];
		sayiArr1[sayiArr1.length-1]=sayiArr[0];
		for (int i = 0; i < sayiArr1.length-1 ; i++) {
			sayiArr1[i] = sayiArr[i+1];
		}
		System.out.println(Arrays.toString(sayiArr1));


	}

}
