package day13_stringmanipulation;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {
		
		
		String str= "Javayla hayat ne guzel";
		System.out.println(str.endsWith("zel")); // true
		
		System.out.println(str.endsWith("ne guzel"));  //true
		System.out.println(str.endsWith("zel "));    //false
		
		//kullaniciden bir mail isteyin
		//eger @ isareti icermiyorsa "girdiginiz bilgi email degil"
		//eger @ isareti iceriyor ama @gmail.com icermiyorsa  "lutfen gmail adresi yazin
		//eger ilk iki sartý saglýyor ama @gmail.com ile bitmiyorsa "gecersiz gmail adresi yazsin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen email'inizi giriniz");
		String email= scan.next();
		
		
		
		
		
		
		
	}

}
