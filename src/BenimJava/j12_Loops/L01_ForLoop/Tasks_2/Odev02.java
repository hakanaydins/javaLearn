package BenimJava.j12_Loops.L01_ForLoop.Tasks_2;

import java.util.Scanner;

import static java.lang.System.in;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

		Scanner sc=new Scanner(in);
		System.out.println("bir ifade giriniz");

		String ifade=sc.nextLine();

		int count = 0;

		for (int i = 0; i < ifade.length(); i++) {
			if (ifade.charAt(i) >='0' && ifade.charAt(i) <= '9')
				count++;
		}
		System.out.println("Girdiğiniz stringdeki rakam sayısı = " + count);



	}
}
