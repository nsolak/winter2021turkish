package day15_methodCreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		/*
		Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun.
        Kullanici 2,3 veya 4 degerini girerse
        kullanicidan bu sayilari girmesini isteyin
        ve sayilarin toplamini yazdirin.
        Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
        “Cok sayi girdiniz, ben toplayamam” yazdirin.
        */

		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen kaç sayi toplamak istediginizi giriniz");
		int adet= scan.nextInt();
		
		if (adet<2) {
			System.out.println("En az iki sayi giriniz");
		}else if(adet==2){
			
			ikiSayiTopla();
		}else if(adet==3){
			ucSayiTopla();
		}else if(adet==4){
			dortSayiTopla();
		}else {
			System.out.println("Cok sayi girdiniz, ben toplayamam");
			
			}
		}

	private static void dortSayiTopla() {
		// TODO Auto-generated method stub
		
	}

	private static void ucSayiTopla() {
		// TODO Auto-generated method stub
		
	}

	private static void ikiSayiTopla() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}	