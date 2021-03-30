package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		
		
		 
		
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun ismini giriniz"); 
		
		String gunIsmi = scan.nextLine().toLowerCase(); //girilen tum yaziyi kucuk harfe cevirdik
		
		if(gunIsmi.equalsIgnoreCase("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
		System.out.println("Paz");
		}else if(gunIsmi.equalsIgnoreCase("Sali")) {
             System.out.println("Sal");
		}else if (gunIsmi.equalsIgnoreCase("CARSAMBA")) {
	   System.out.println("Car");
	   } else if(gunIsmi.equalsIgnoreCase("persembe"))  {
		System.out.println("Per");	
	   } else if(gunIsmi.equalsIgnoreCase("cuma")   || gunIsmi.equalsIgnoreCase("cumartesi")) {
		System.out.println("Cum");
	   }	 else {
		     System.out.println("Lutfen gecerli gun ismi giriniz");
	   }
		
	}
}
		
		
		
		
		
		
