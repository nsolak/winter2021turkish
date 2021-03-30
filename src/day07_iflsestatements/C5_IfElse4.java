package day07_iflsestatements;

import java.util.Scanner;

public class C5_IfElse4 {

	public static void main(String[] args) {
	  // Kullaniciden ucgenin kenar uzunuklarini alin
	  //  ýc kenar esitse "eskenar" yazdirin
	  // yoksa "eskenar degil" yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir karakter giriniz");
         double kenar1=scan.nextDouble();
         double kenar2=scan.nextDouble();
         double kenar3=scan.nextDouble();
         if (kenar1==kenar2 && kenar2==kenar3);{
        	 
        	 System.out.println("eskenar ucgen");}
         
        	 {System.out.println("eskenar ucgen degildir");
        	 
        	 }
         
	}

}
