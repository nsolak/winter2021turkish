package day12_stringmanupalation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		//IndexOf methodu bize istedigimiz karakter(lerin) indexini verir
		
		String str ="Java ogren, is s"; 
		
		System.out.println("char arama" + str.indexOf('g'));//6
		
		System.out.println("String arama" + str.indexOf("g"));//6
		
		System.out.println();
		System.out.println();
		
		System.out.println("baslangýc indexi ile " + str.indexOf('a', 4));
	   System.out.println("olmayan harf" + str.indexOf("dert"));//
	   
		// kullaniciden bir cumle  isteyin
	   //case sensitive olmadan Java kelimesi icerip icermedigini yazdirin
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz:");
		
		String cumle= scan.nextLine().toLowerCase() ;
		int sonuc = cumle.indexOf("java"); //java varsa ,ilk java kelimesinin index'ini dondurur
		                                   //java yoksa,-1
		
		System.out.println(sonuc==-1 ? "Java icermiyor" : "Java iceriyor");
		
		if (cumle.indexOf("java")>=0) {  //java kelimesinin index'inin 0 veya daha buyuk old.kon.ediyor
			System.out.println("Cumle java iceriyor");
		} else {
             System.out.println("Cumle java icermiyor");
		}
		
		
		
		
		
		
	   
	   
	   
	}

}
