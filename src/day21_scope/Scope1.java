package day21_scope;

public class Scope1 {
	
	static int okulId=1201;
	static String okulAdi="Y�ldiz Koleji";
	static boolean acikMi;
	
// static variable'lar class level'da olusturuldugu icin class'in her yerinden kullan�labilirler
	
	public static void main(String[] args) {
		System.out.println(okulId+" " +okulAdi + " " + acikMi);
		okulId=1202;
		acikMi=true;
		
		staticMethod();
		
		System.out.println(okulId+" " +okulAdi + " " + acikMi);
	}

	
	public static void staticMethod() {
		System.out.println(okulId+" " +okulAdi + " " + acikMi);
		okulId=1203;
		
	}
	
	
	public void method() {
		okulId=1205;
		
	}
}
