package day16_ForLoop;

import java.util.Scanner;

public class C6_ForLoop6 {

	public static void main(String[] args) {
		//Soru 8) Interview Qustion kullanicidenbir string isteyinve
		//stringitersine ceviren bir program yazin.
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen tersine cevirmek icin bir yazi giriniz");
        String yazi= scan.nextLine();
         //1.yol variable olusturup en son yazdiralim
        String tersYazi="";
        
        for(int i = yazi.length()-1 ; i>=0; i--) {
        	tersYazi+=yazi.charAt(i);
        	
        }
        
        System.out.println("Girdiginiz yazinin tersten yazilisi :" + tersYazi);
        
	}   
}    
        