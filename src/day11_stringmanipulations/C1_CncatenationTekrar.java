package day11_stringmanipulations;

import java.util.Scanner;

public class C1_CncatenationTekrar {

	public static void main(String[] args) {
		// kullaniciden ьз rakam alin ve en buyuk sayiyi yazdirin
       
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen 3 adet sayi giriniz");
		
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		double sayi3= scan.nextDouble();
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("En buyuk sayi: " + sayi1);
			
		} else if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En buyuk sayi: "+ sayi2); 
			
		}else if (sayi3>sayi1 && sayi3>sayi2) {	
			System.out.println("En buyuk sayi:"+ sayi3);
			
		} else {	
			System.out.println("Lutfen geceri bir sayi giriniz");
			
			
			

		}
		
		
	
	
		
		
	}

}
