package day08_ifelseifnestedif;

import java.util.Scanner;

public class C4_ArtikYilNestedIf {

	public static void main(String[] args) {
	
		
		
		
		
	  Scanner scan=new Scanner (System.in)	;
	  System.out.println("Lutfen yil yaziniz");
	  
	  int yil = scan.nextInt();
	  if (yil%100==0) { //100'e bolunebiliyor
		
		if (yil%400==0) {
			System.out.println("Artik yil");
		}else  {
		    System.out.println("Artik yil degil");
		}
	}else if  // 100'e bolunemiyor
		(yil%4==0) {
		System.out.println("Artik yil");
	} else {
		
		
		System.out.println("Artik yil degil");
	}
		
		
		
		
		
		
		
		
		
	}		
}
