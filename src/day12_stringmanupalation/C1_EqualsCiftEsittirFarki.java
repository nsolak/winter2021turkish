package day12_stringmanupalation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		
		String str1= "Ali Can";
		String str2= str1 + "";  // Ali Can
		
		System.out.println(str1==str2); //false
		// == Stringlerinhem degerlerine hemde adreslerine bakar
		// bu örnekde str1+"" yazdigimizde concatenation yapidigi icin Java yeni
		//bir obje olusturur ve islemin sonucunu yeni objenin icine koyar
		//str1ve str2 'yi == ile karsilastirirsek degerleri ayni fakat adresleri 
		// farkli oldugu icin false doner
		
		
		System.out.println(str1.equals(str2)); // true
		 // equals () methodu sadece Stringlerin degerlerini karsilastirir
		// bu örnekte str1 ike str2 nin degerleri ayný oldugu icin true döndürür
		
		
		
		String str3 = "Ali Can";
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
	}

}
