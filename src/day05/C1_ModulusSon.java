package day05;

public class C1_ModulusSon {

	public static void main(String[] args) {
		//verilen bir integer 'in birler basamagindeki rakami yazdirin
		
		int sayi=1469;
		
		System.out.println("verilen sayinin birler basamagi : "+ sayi%10);
		 // verilen sayiyin birler basamagi hari�geriye kalan basamaklariyazdirin
		System.out.println(sayi/10);  // 146
		System.out.println(sayi);     // 1469
		System.out.println(sayi/=10); // 146
		System.out.println(sayi);  //146
		
		
		// sayi/10 ile sayi/=10 arasindaki fark nedir?
		// = isareti atama (asignment) demektir
		//bir islemde = isareti varsa orada deger kalici olarak degisir
		// = isareti yoksa sadece o anl�k matematiksel bir islem yapar
		// sayi/ 10 yazilirse sayinin degeri degismez
		//sayi/=10 yazilirse sayi10'a bolunur ve yeni deger olarak sayiya atan�r
		
		
		
		
		

	}

}
