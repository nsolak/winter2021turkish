package day10_switchcase;

import java.util.Scanner;

public class C4_SwitchCase2 {

	public static void main(String[] args) {
		// kullanicidan kacinci ayda oldugumuzu isteyin
				// sayi olarak girilen ay'in ismini yazdirin
				
		// kullan�c�dan kac�nc� ayda oldugunu al�n ve onu yaz�ya cevirin
        
	    Scanner scan=new Scanner(System.in);
	        
	        System.out.println("lutfen kac�nc� ayda oldugunuzu giriniz");
	        
	        int rakam=scan.nextInt();
	        
	        switch (rakam) {
	        
	        case 1:
	            System.out.println("ocak");
	            break;
	        case 2:
	            System.out.println("subat");
	            break;
	        case 3:
	            System.out.println("mart");
	            break;
	        case 4:
	            System.out.println("nisan");
	            break;
	        case 5:
	            System.out.println("mayis");
	            break;
	        case 6:
	            System.out.println("haziran");
	            break;
	        case 7:
	            System.out.println("temmmuz");
	            break;
	        case 8:
	            System.out.println("agustos");
	            break;
	        case 9:
	            System.out.println("eylul");
	            break;
	        case 10:
	            System.out.println("ekim");
	            break;
	        case 11:
	            System.out.println("kas�m");
	            break;
	        case 12:
	            System.out.println("aral�k");
	            break;
	            
	        default:
	            System.out.println("lutfen ay giriniz");
	            break;
	        }
	        scan.close();
	    }
}  

		
		
		