package day14_methodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		 
		 // verilen uc double sayinin ortalamasini alin birmethod yazin
		//main method icinden cagirarak  methodu calistirin
		
		ortalama(80,60,54);
		ortalama(80,60);
		
		
		
		
	}// MM(main) sonu
public static void ortalama(double sayi1, double sayi2 ,double sayi3) {
	System.out.println("girdiginiz uc sayinin ortalamasi : " + (sayi1+sayi2+sayi3)/3);
}
	
public static void ortalama(double sayi1, double sayi2) {
	
	System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
	
}
	
	
}//class sonu
