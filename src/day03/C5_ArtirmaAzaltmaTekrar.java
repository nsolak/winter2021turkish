package day03;

public class C5_ArtirmaAzaltmaTekrar {

	public static void main(String[] args) {
		
		int num = 15;
		
		// bir sayiyi 2 artirmak istersek sayiyi iki ile toplarız
		
		int num2 = num + 2;
		
		System.out.println("num2 = " + num2);
		System.out.println("num = " + num);
		
	num=num+5; 
		//esitligin solunda num yazdigimizde esitligin sagindaki islemde olusan sonuc num
		           // num variable'ina atanir. bu atirden sonra num= 20 dir
		System.out.println("16.satirden sonra num = " + num);
		 
	 System.out.println(num+12); //32
	 
	 // bir sayiyi artirmak (increment) istersek o sayiiya istedigimiz sayiyi ekler ve sonucu
	 // variable'a atariz
	 // num'i 8 artirir
	 
	 num = num+8; //num= 28
	 //num ' 5 artirin
	 
	 num +=5; //num=33
	 
	 System.out.println("Javanin artirisinden sonra num= " + num); 
	 
	 // num'10 artiralim
	 num +=10; // num =43
	 
	 // num'i 1 artirin
	 
	 // num = num + 1;
	 num+=1; //num=44
	
	 // sadece 1 artirmaya ozel olarak Java pratik method
			 
	num++; // num=45
	 
	 System.out.println("num'in son hali : " + num);
	 
	 
	 
	 
	 
	 
	 
	 

	}

}
