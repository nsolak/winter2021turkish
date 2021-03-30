package day10_switchcase;

import java.util.Scanner;

public class C6_SwitchCase6 {

	public static void main(String[] args) {
		// Kullanicidan VIP (Very Important Person) kisaltmasinda
		//hangi harfin anlamini istedigi soralim
		// girilen harfin aciklamasini yazdiralim
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen hharf giriniz");
		
		char harf = scan.next().charAt(0);
		
		switch(harf) {
		case 'v':
		case'V' :
			System.out.println("Very");
			break;
		case'I' :
		case'i' :
		    System.out.println("Important");
		    break;
		    
			
		}
		
		
		
		
		
		
		
	}

}
