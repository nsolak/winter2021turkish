package day17_forloop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		// kullaniciden 35'dan kucukpozitif sayi alin 
		//girilen sayinin faktoriyelini hesaplayip yazdiran bir method olusturun
		//6! = 1 * 2 * 3 * 4 * 5 * 6= 720
          
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen  faktoryel hesaplamak icin 35 den kucuk bir tamsayi giriniz");
		int sayi= scan.nextInt();
		
		if (sayi<=0 || sayi>=35) {
			System.out.println("lutfen gecerli bir sayi giriniz");
		} else {
            faktoryelBul(sayi);  //5
		}
		
		
		}
       
	   public static void faktoryelBul(int sayi) {
		   long faktoryel=1;
		   
		   for(int i = 1; i <= sayi; i++) {
			   faktoryel*=i;
		   }
		  System.out.println(faktoryel); 
	   }
	
	
}
