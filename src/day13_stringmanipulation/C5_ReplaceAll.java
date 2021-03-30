package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		//
		String str= "Java ogren, mutlu ol,Java candir 12345";
		
		System.out.println(str.replace("Java", "hava"));
		
		// replaceAll() methodu replace() methoduna benzr ama 2 farki vardir
		//1-replace() methodu char kabul eder ama replaceAl() kabul etmez
		
		
		
		System.out.println(str.replaceAll("\\w", "*"));//tum harf ve rakamlar 
		                                                //yerine * yazacak
		
		System.out.println(str.replaceAll("\\W", "*"));// w 'nun tersi
		
		System.out.println(str.replaceAll("\\d", "."));//sayilari. yapar
		
		System.out.println(str.replaceAll("\\D", "."));// sayi olmayanlari . yapar
		
		System.out.println(str.replaceAll("\\s", "&"));// bosluklari & yapar
		System.out.println(str.replaceAll("\\S", "&"));//bosuk olmayan herseyi& yapar
		
		System.out.println(str.replaceAll("\\d", "")); // sayileri siler
		
		
		
		
		
		
	}

}
