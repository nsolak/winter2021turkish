package day34_Inheritance;

public class Muhasebe extends Personel {
// Muhasebe class'inin personel class'inin child class'i oldugu
	//declare etmek icin class ismine extends keyword ile
	//parent class'iyazariz
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		
		maas= 30*8*saatUcreti;
		
		
		return maas;
		
	}

}
