package day21_scope;

public class Scope4 {

	public static void main(String[] args) {
		
		int sayi=10;
		
		
		
		int sayi2;// 2-bir local variable deger atanmadanda olusturulabilir
		// 2-System.out.println(sayi2); //2-ancak ilk deger atamasi yapilmayan variablelar kullanilmaz
		// 2-sayi2++; //2- ilk deger atanmadigi icin artirma yada azaltmada yapmayiz
		// 2-java deger atamasi olmadan local variable olusturulmasina izin verir,ilerde deger atanacak di
		
		sayi2=15;//2-olusturma ayri satirda (11.satir),deger atamasi ayri satirda (16.satir) yapilabilir
		
		// 3- birden fazla methodun oldugu classlarda her method da kullanmamiz gereken
		// 3-ortak variable lar varsa class levey da variable olusturmaliyim
		//3-ortak variable class'in yapisina bagli olarak instance veya static olabilir
		
	}

	public static void staticMethod() {
		String isim="Hasan";
	}
	
	public void method() {
		boolean isTrue=true;
	}
	
}
