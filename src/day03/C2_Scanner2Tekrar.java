package day03;

import java.util.Scanner;

public class C2_Scanner2Tekrar {

	public static void main(String[] args) {
		
		// kullaniciden ismini isteyip ilk harfini buyuk harf olarak yazdirin
		//mehmet ==>basharfiniz : M
		
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen isminizi giriniz"); 
		
		char ilkharf = scan.next().toUpperCase().charAt(0);
		
		//String de harflerin indexleri 0'dan baslar
		//biz ilk harfi almak istedigimiz icin index olarak 0 girmeliyiz
		
		System.out.println("bas harfiniz : " + ilkharf);
		
		// eger charAt(0) yazdiktan sonra . koyarsak methodlar gelmez
		//cunku charAt (0) methodu kullanilince variable'mizi char yapmis oluruz 
		// chr primitive data tipindedir ve
		// primitive data tipleri metholara sahip degildir
		
	

	}

}
