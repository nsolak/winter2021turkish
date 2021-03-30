package day37_overriding;

public class Formen {
public String sorumluOldBolum="bakim";
public String isim="Emrullah";

	public static void main(String[] args) {
		
		
		//Inheritancede data turu olarak class isimi kullanimi
		
		
		
		Formen fr1=new Formen();
		//fr1 objesini kullanarak hangi classlarin variable'larini gorebilirim
		
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim + " " + fr1.sorumluOldBolum+" "+ fr1.maas);
		//emrullah marangozhane 10000
		
		Isci fr2=new Formen();
		// data turu olarak Isci secildigi icin
		fr2.bolum="Kaynak atolyesi";
		
		System.out.println(fr2.isim + " " + fr2.bolum+" "+ fr2.maas);
		// Mesut Kaynak atolyesi 5000
		
		
		Personel fr3=new Formen();
		System.out.println(fr3.isim);//Emre
	}

}





//minik bir degisiklik ile isci class'ina public String isim="Mesut" ekledik. Bu class'a da public String isim="Emrullah"; ekledim.
// Personel classinda hala Emre duruyor. fr3'e deger atamadim ama isim olarak ekrana Mesut yazdiriyor neden ?
// Cunku bir objeden variable'a gitmek istiyorsak once data turune bakariz.
// Data turu olarak Isci old. icin oradaki atamayi yazdirir yani Mesut'u eger orada isim olmasa idi,
// parent class'a cikip bakacakti ve oradaki variable'i yazdiracakti.

