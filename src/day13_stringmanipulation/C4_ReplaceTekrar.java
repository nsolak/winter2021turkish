package day13_stringmanipulation;

import java.util.Scanner;

public class C4_ReplaceTekrar {

	public static void main(String[] args) {
		  // Kullanicidan bir cumle isteyin 
        // cumledeki tum bosluklari silin ve
        // tum a'larin yerine e yazdirin
       
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen  bir cumle giriniz");
		String str=scan.nextLine();
		
		str=str.replace(" ", "");
		str=str.replace("a", "e");
		System.out.println(str); // atmam yapmazsanýz manipulations stri calýstýrmaz
		// eger atama yaparsak str kalici olarak degistigi icin  biz bir daha
		//orijinal str'a ulasamayiz
		// bunun icin kullaniciden aldigimiz str'a degil yeni bir String e 
		//atamak daha mantiklidir
		System.out.println("Lutfen bir cumle daha giriniz ");
		String str2=scan.nextLine();
		
		System.out.println(str2.replace(" ", "").replace('a', 'e'));
		
		// hem a hem de e nin yerine i yazalim
		
		System.out.println(str2.replace("a", "i").replace('e', 'i'));
		
		// hem a hem e nin yerine i yazaim buyuk kucuk harf gozetmeksizin
		
System.out.println(str2.toLowerCase().replace("a", "i").replace("e", "i"));
		
		
		
		
		
		
		
		
	}

}
