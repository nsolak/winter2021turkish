package day03;

public class C4_DataCastingDaralmaTekrar {

	public static void main(String[] args) {
		// double bir degisken olusturalımve bunu ınt ve sonra da byte'a cevirin
		
		double numDouble=400.56;
		
		int numInt= (int)numDouble;
		// double'dan integer'a gecerken eger sayida ondalikli bolum varsa
		// Java ondalikli bolumu siler (yok sayar)
		
		System.out.println("integer degisken degeri : " + numInt);
		
		byte numByte= (byte)numInt;
		// daha dar (narrow) bir dta tipine cevirirken eger data tipinin sinirindan buyukse
		//negatif en kucuk sayidan devam eder, istenen sayiya gelinceye kadar 
		//tekrar takrar en kucuk negatif sayiya gider
		
		System.out.println("byte degisken degeri :" + numByte);
		
		
		
		
		
		
		
		
		

	}

}
