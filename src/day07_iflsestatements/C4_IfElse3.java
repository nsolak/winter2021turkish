package day07_iflsestatements;

import java.util.Scanner;

public class C4_IfElse3 {

	public static void main(String[] args) {
		// kullaniciden yasini sorun
		//65 den buyukse "emekli olabilirsin" yoksa "emekli olamazsin" yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen yasinizi giriniz");
		int yas=scan.nextInt();
		
		if (yas>=65) {
          System.out.println("Emekli olabilirsin");
	}    else {
        System.out.println("Emekli olamazsin");
scan.close();
}
			
}
	
}