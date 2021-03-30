package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		// Kullaniciden 4 basamakli bir sayi alalim ve 
		//sayinin basamaklarini ters sirada yazdiralim
		
		
		// bir sayinin basamaklarini elde etmek icin 2 islemi tekrar takrar yapariz
		//1. islem en sondaki basamagi elde etmek
		//2. islem en sondaki basamagi yok etmek
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Basamaklarini bulmak icn 4 basamakli bir sayi giriniz");
		
		int sayi= scan.nextInt(); // bu satirden itibaren elimizde 4 basamakli bir sayi var 
		// 4 basamagi elde etmek icin yukarida yazdigimizislemi 3 kere yapiyoruz
		// 1. tekrar
		
		int birlerBas= sayi %10;
		sayi /= 10;
		// bu satirden itibaren sayimiz 3 basamakli oldu
		// onlar basamagini bulmak icin 2.tekrar
		
		int onlarBas = sayi % 10 ;
		sayi/=10 ;
		
		// bu satirden itibaren sayimiz 2 basamakli 
		//3.tekrar 
		
		int yuzlerBas= sayi% 10;
		sayi/=10;
		
		// busatirden itibaren sayimiz 1 basamakli  
		int binlerBas= sayi%10; // burada % islemi yapmak zorunda degiliz
		
		// tum basaklar var
		// tm basamaklarý yazdirin
		System.out.println("Birler basamagi : " + birlerBas);
		System.out.println("Onlar basamagi : " + onlarBas);
		System.out.println("Yüzler basamagi : " + yuzlerBas);
		System.out.println("Binler basamagi : " + binlerBas);
		System.out.println();
		//sayiyi tersden yazdirin 
		
		System.out.print(birlerBas);
		System.out.print(onlarBas);
		System.out.print(yuzlerBas);
		System.out.println(binlerBas);
		System.out.println(); // yukaridadi son print'i println yaparsam
		// bu satira ihtiyac kalmaz
		
		// sayinin rakamlari toplamini bulalim
		System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
		// rakamlari toplamini degil sayileri yanyana yazdirmak istersek
		System.out.println("Yazdiginiz sayinin tersten yazilisi : " +birlerBas+onlarBas+yuzlerBas+binlerBas);
      scan.close();
      
	}

}
