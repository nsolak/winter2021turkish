package day02;

import java.util.Scanner;

public class C2_Scanner2 {
	
     // kullaniciden dairenin yaricapini isteyin ve dairenin alanini yazdirin
	
	public static void main(String[] args) {
		
	  Scanner scan= new Scanner(System.in);
	  System.out.println("alanini hesaplamak icin dairenin yaricap�n� girin");
	  
	  //kulaniciden yaricap istedim,
	  //once kullanicinin girdigi yaricapi icine koyabilecegim bir degisken olusturmaliyim
	  
	  double yaricap=scan.nextDouble();
	  
	
	  System.out.println("dairenin alani=" + 3.14*yaricap*yaricap);
	  
	  
	  
	}
	
}
