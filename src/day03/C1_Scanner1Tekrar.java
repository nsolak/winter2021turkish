package day03;

import java.util.Scanner;

public class C1_Scanner1Tekrar {

	public static void main(String[] args) {
	
	    // kullanicidan isim ve soyismini isteyip
        // isim : mehmet 
        // soyisim : bulutluoz
        // kursumuza kaydiniz alinmistir, tesekkur ederiz
        // seklinde yazdirin
		
     //Scanner : kullanicidan bilgi almak i�in kullaniyoruz
	 //3 adimda islemi tamamliyoruz
	 //1.adim Scanner objesi olusturuyoruz 
	 //Scanner'in calismasi icin java.util (utilities) kutuphanesinden ilgili 
	 //kismi classsimize import etmeliyiz
		
		Scanner scan = new Scanner(System.in);
		
		// 2.adim kullaniciye ne istedigimizi belirten bir mesaj yazmaliyiz
		
		System.out.println("lutfen sadece isminizi giriniz"); 
		
		//3.adim bir variable olusturup kullanicinin girdigi degeriatayacag�z
		String name= scan.nextLine();
		
		System.out.println("Lutfen sadece soyisminizi giriniz");
		// String surname= scan.next.();bu �ekilde yazarsak sadece ilk kelimeyi alir sonrakileri almaz
		String surname =scan.nextLine();
	    // benden istennen sekilde ciktiyi yazdirabilirim
		//eger yazdiracagimiz yazi sabit bir yazi ise "" arasinda yazdiriyoruz
		// eger bir variable'a atanm�s degeri yazdirmak istersek
		//""olmadan sadece variable ismini yaziyoruz
		
		System.out.println("Isminiz : " + name);
		System.out.println("Soyisminiz : "+ surname); 
		System.out.println("kursumuza kaydiniz alinmistir, tesekkur ederiz");
		
		
		
	}
		
}
