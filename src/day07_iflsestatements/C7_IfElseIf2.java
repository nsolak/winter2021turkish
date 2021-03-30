package day07_iflsestatements;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
	// kullaniciden iki sayi isteyin
	//sayilerin ikiside pozitif ise sayilerin toplamini
	//yazdirin, sayilerin ikiside negative ise sayilerin carpimini yazdirin,
	//sayilerinn ikisi
	// farkli isaretler sahipse  "farkliisaretlerde sayilarla islem yapamazsin" yazdirin
	//sayilerdan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin	
		

	Scanner scan=new Scanner(System.in)	;
	System.out.println("Lutfen iki sayi giriniz");
	double sayi1=scan.nextDouble();
	double sayi2= scan.nextDouble();
	
	
	if (sayi1==0 || sayi2 ==0) {
		System.out.println("sifir carpmaya gore yutan elemandir");
		} else if(sayi1>0 && sayi2>0) {
			System.out.println("sayilerin toplami : " + (sayi1+sayi2));
		}else if(sayi1<0 && sayi2<0) {
			System.out.println("sayilerin carpimi : " + sayi1*sayi2);
		}else {
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
		}
	}

}
