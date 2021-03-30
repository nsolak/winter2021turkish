package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// kullaniciden bir string girmesini isteyin
		// girileng'in son harfini buyuk harf olarak yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String str = scan.nextLine().toUpperCase();
		
		System.out.println("girdiginiz cumlenin son harfi : " + str.charAt(str.length()-1));
		
		// length methodu girilen String'in uzunlugunu verir
		//-1 : 10 harfliyse son index 9
		
		//System.out.println(str);  // kullanici ne girdi buuyk harfle onu yazdirir
		
		String str2="";                    //"Ali "  --> 4 // 0 dan saymaya baslýyoruz bosluguda sayýyoruz
		System.out.println(str2.length()); //0
		
		
		String str3=null; //null hic demek
		                  // normalde String'ler ""icine yazilir ama null icin buna
		                   //gerek yoktur
		                  // null case sensitive'dir, dolayisiyle NULL veya Null yazilmaz
		                  // nullbir deger degildir, adece hicligi gosterenbir pointer'dir
		
		
		System.out.println(str3.length()); // RTE verir
		
		
		// null deger atanan Strig ile String manipulation method'lari kullanilmaz
		
		//System.out.println(str3.equals(str2));
		System.out.println(str2.charAt(1));// indexi 1olan (bastan ikinci) harfi verir
		System.out.println(str3.charAt(1)); // RTE
		
		
		
		
	}

}
