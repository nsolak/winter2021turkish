package day19_dowhileloop;

import java.util.Scanner;

public class C5_DoWhileLoop3 {

	public static void main(String[] args) {
		/*
		Soru 5 ) Kullanicidan bir sifre girmesini isteyin.
	Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
	 Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
	  ve gecerli sifre girdiginde �Sifreniz Kabul edilmistir� yazdirin.
	  - Sifre kucuk harf icermelidir
	  - Sifre buyuk harf icermelidir
	  - Sifre ozel karakter icermelidir
	  - Sifre en az 8 karakter olmalidir.
         */
		Scanner scan=new Scanner(System.in);
		String sifre="";
		
		do {
			System.out.println("Lutfen sifrenizi giriniz");
			sifre=scan.nextLine();
			
			kucukHarfVarMi(sifre);
			
		}while();
	}
        
	public static int kucukHarfVarMi(String sifre) {  //sifre= MehmetJava123
		int flagKucuk=0;
		int index=0;
		
		while(index<sifre.length()) {
			if(sifre.charAt(index)>'a'  && sifre.charAt(index)<='z') {
				flagKucuk=1;
			}
			index++;
		}
		if(flagKucuk==0) {
			System.out.println("sifre kucuk harf icermelidir");
		}
		
		return flagKucuk;
	}
	
}
