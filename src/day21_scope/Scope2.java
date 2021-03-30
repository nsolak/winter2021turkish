package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		//Static variable'lar icin object olusturma ihtiyaci yoktur
		//
		
		
		System.out.println(Scope1.okulAdi);
		System.out.println(Scope1.okulId);// java Run Time programdýr 
		                                  //Scope2 Class'i calistirildiginda Scope1 calismazzz
		                        //dolayisiyla en basta olusturulan veya atanan degerler gecerli olur
		
		Scope1.okulAdi="Mehmet Koleji";
		System.out.println(Scope1.okulAdi);//Mehmet Koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId);
		System.out.println(Scope1.okulAdi);
	}

}
