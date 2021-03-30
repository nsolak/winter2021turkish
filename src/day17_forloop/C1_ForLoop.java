package day17_forloop;

import java.util.Scanner;

public class C1_ForLoop {

	public static void main(String[] args) {
		
		/*
		 Kullanicidan bir tamsayi girmesini isteyin
		 sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		 Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		
		 Main method icinde Kullanicidan bir sinir deger isteyin
		 rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		
		
		        
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Lutfen bir tamsayi giriniz");
		        int sayi = scan.nextInt();
		        System.out.println("Sinir degeri giriniz");
		        int sinir = scan.nextInt();
		        
		        if (sayi<=0) {
		            System.out.println("Lutfen pozitif bir tam sayi giriniz");
		        } 
		            rakamlarTop(sayi);
		        
		            if (rakamlarTop(sayi)>sinir) {
		                System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk");
		            } else {
		                System.out.println("Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil");
		            }
		    }
		    public static int rakamlarTop(int sayi) {
		        
		        int toplam = 0;
		        String x = sayi+"";
		        for(int i = 0; i<x.length(); i++) { ////    524    // 7  // 10 // 1+2+3+4+ //
		            
		            toplam+=sayi%10; // 4 // 2
		            sayi/=10; // 52 // 5
		            
		        }
		        return toplam;
		    }
		
		

		
		
		
		
	}


