package day15_methodCreation;

import java.util.Iterator;

public class C4_Forloop1 {

	public static void main(String[] args) {
		// 5 defa Hello World yazdiralim
		/*
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		*/
		// bunun yerine loop kulaniyoruz
		//ne yapacagimizi javaya soyluyoruz, kac kere yapmasi gerektigini de soyluyoruz
		
		//Tumloplsrda 3 seyi yazmak zorundayiz
		//1)baslangic degeri
		//2) bitis degeri
		//3)artis degeri
		
		for (int i=1 ; i<=5 ; i++) {
			System.out.println("Hello World");

		} 
		
		
       // not:eger sart kismi bizim artisimize gore hep true verirse loop
		//sonsuz donguye girer
		//Not:loop'da artis degeri pozitif oldugu gbi negatifde olabilir i-- 
		//Not: artis degeri bir olmak zorunda degil ,farklida olabilir
		//Not: eger loop'un sarti hic true olmazsa loop body hic devreye girmez
		
		}
		
	}


