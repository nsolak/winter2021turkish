package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		

		   
		   // Scanner ile kullanicidan bilgi alabiliriz
		   // 3 adimla scanner islemini gerceklestiriyoruz
			
			// 1. adim Scanner objesi olu�turacag�z
			
		    Scanner scan = new Scanner(System.in);
			
		    // new : Java da ne zaman new kelimesini g�rseniz yeni bir objekt ousturuluyor demektir
			// parantezin icine yaz�lan degerlere parametre diyoruz ve Scanner icin System.in yazmaniz gerekir
			// Bir kod yazdiginizde kodun altinde kirmizi cizgi olusuyorsa veya satir numarasi
			// olan kisimda kirmizi * olusuyorsa bir seyler yanl�s demektir
			// java.util java'nin bizim icin hazirladigi bir kutuphanedir,ihtiyacimiz oldu�unda olan kodlar�
		    // class'a import etmemiz yeterlidir
		    // scan olusturdugumuz Scanner objesine verdigimiz isimdir. farkl� isimler de verebiliriz
		    // ancak scan ismi tum programcilar taraf�ndan kullanilan ir isimdir
		    // kodumuzun anlasilabilir ve rahat okunabilir olmasi icin scan ismini kullanmamiz tavsiye edilir
		   
		    // 2. adim kullaniciya bir mesaj yazin
	        System.out.println("karenin bir kenar uzunlugunu girin");
		   
		    // 3.adim kullanicinin konsola girdigi degeri programimiza alacag�z
	        // ve bir veriable olusturup bu degeri atayacagiz
	        // kullanicidan bir kenar uzunlugu istedigim icin kullanici kucuk bir sayida girebilir, buyuk bir sayida
	        // yazabilir, tam sayida yazabilir, virgullu sayida yazabilir
	        double kenar=scan.nextDouble();
	       System.out.println(kenar*kenar);
		   //5.2*5.2=27.04
		   
		   
		   
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
