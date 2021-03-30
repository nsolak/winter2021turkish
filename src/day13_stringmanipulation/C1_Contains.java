package day13_stringmanipulation;

import java.util.Scanner;

public class C1_Contains {

	public static void main(String[] args) {
		
	// kulllaniciden bir cumle ve aramak istedigi bir String isteyin
   //cumle String'i iceriyorsa "basarýlý" ,degilse "basarýsýz" yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle= scan.nextLine().toLowerCase();  //Java guzel
		
		System.out.println("Lutfen aramamý istediginiz String'i giriniz");
		String aranan =scan.nextLine().toLowerCase();//Java
		
		//cumle.contains(aranan) // bu islemin sonucu boolean,benim bunu 
		                       //yaziya cevirmem lazim
		
		System.out.println(cumle.contains(aranan) ? "Basarili " : "Basarisiz");
	
		// kullaniciden  mail adresini isteyin. mailadresi @gmail.com iceriyorsa
		//"mailiniz kaydedildi",yoksa "lutfen gmail adresinizi giriniz" yazdirin
		
		System.out.println("Lutfen mailinizi giriniz");
		String email= scan.next();
		
		   
        int sondami = email.indexOf("@gmail.com", email.length()-10); // index olarak length()-10 yazarsam
        // eger email gmail.com ile bitiyorsa bu islemin sonucu bir index olur (int)
        // eger email gmail.com ile bitmiyorsa -1
        
        if (email.contains("@gmail.com") && sondami !=-1) {
            System.out.println("mailiniz kaydedildi");
        } else {
            System.out.println("lutfen gecerli gmail adresinizi giriniz");
        }
        
        // eger @gmail.com'un en sonda oldugunu kontrol etmek istersek 
        
        
    }



		}
		
		
		
	


