package day10_switchcase;

import java.util.Scanner;

public class C2_Ternary {

	public static void main(String[] args) {
		// Kullani
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tam sayi giriniz");
		int sayi= scan.nextInt();
		//7 eger ternary'de iki durum icin farkli data tipleri  donsu oluyorsa
		// ya variable 'a atama yapmadan direk yazdiriniz
		// yada mumkunse sonuclari ayni data tipine cevirmeye calisiriz
		
		
		String sonuc = sayi%2== 0 ? "cift" : sayi*sayi+"";
		System.out.println(sonuc);

	}

}
