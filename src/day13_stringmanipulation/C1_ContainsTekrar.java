package day13_stringmanipulation;

import java.util.Scanner;

public class C1_ContainsTekrar {

	public static void main(String[] args) {
		// kulllaniciden bir cumle ve aramak istedigi bir String isteyin
		   //cumle String'i iceriyorsa "basarýlý" ,degilse "basarýsýz" yazdirin
				
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen aradiginiz string'i giriniz");
		String aranan = scan.nextLine().toLowerCase();
		
		//cumle.contains(aranan) cumlenin icinde aranan kelime varmý demek
		System.out.println(cumle.contains(aranan) ? "Basarili" : "Basarisiz");
		
		// kullaniciden  mail adresini isteyin. mailadresi @gmail.com iceriyorsa
	    //"mailiniz kaydedildi",yoksa "lutfen gmail adresinizi giriniz" yazdirin
		
		
		System.out.println("Lutfen mail adresinizi giriniz");
        String email= scan.next();
        //eger @gmail.com'un en sonda oldugunukontrol etmek istersek
        int sondami= email.indexOf("@gmail.com",email.length()-10 ); //indexolarak length()-10 yazarsam
          // eger emailgmail .com ile bitiyrsa bu islemin sonucu bir index olu(int)
         //eger email gmail.com ile bitmiyorsa -1 
          
       if ( email.contains("@gmail.com") && sondami !=-1) {
		System.out.println("mailiniz kaydedildi");
	} else {
         System.out.println("Lutfengecerli gmail adresini giriniz");
          }
        
        
        
        
        
        
	}

}
