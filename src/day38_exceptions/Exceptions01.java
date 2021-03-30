package day38_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kulllanicidan iki tam sayi alin ve bolumlerini yazdirin
		
		Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bounecek tam sayiyi yazin");
        int sayi1=scan.nextInt();
        System.out.println("Lutfen kaca bolmek istediginizi yazin");
        int sayi2=scan.nextInt();
//java exceptionslari handleetmek icin try-catch blogu olusturmus
        
        try {
        	System.out.println("bolem isleminin sonucu : " + sayi1/sayi2);
            	
        }catch (ArithmeticException e) {
        	System.out.println("sayiyi sifira bolemezsin");
        }
      
        
	}

}
