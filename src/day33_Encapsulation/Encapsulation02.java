package day33_Encapsulation;

public class Encapsulation02 {
	 private String okulIsmi="Yildiz Koleji";
	    // Okul isminin baska class'lardan okunmasini ama deger atanamamasini istiyorsak
	    // getter() method'u olusturuyoruz
	    
	    private String tcNo="12345678901";
	    private int hesapNo=5554321;
	    // Obje olusturularak deger atanip kullanilmasini istedigimiz ama 
	    // ilk atadigimiz degerin gorunmemesini istiyorsak setter() method'u kullaniriz
	    public int sayi=100;
	    

	public static   void main(String[] args) {
		// eger ulasmak istedigim class uyeleri(class member) public degilse baska
				// package'lerden ulasmak icin extra islem yapmamiz gerekir.

		// yapabilecegimiz islemlerden 1.si Encapsulation
		//bu classda kimseyle paylasmak istemedigimiz variableve methodlar olusturalim
		
		//private yapinca guvenlik konusunu halletmis olduk
		//Ancak class uyeleri'nin private olmasi OOPconcepte aykiri
		
		//encapsulation class'imizda olusturdugumuz class uyelerine 
		//kimlerin ne oranda ulasabilecegini
		
	}
     private void denemeMethod() {
	System.out.println("deneme method'u calisti");
}

     public String getOkulIsmi() {
         return okulIsmi;
     }
     public void setTcNo(String tcNo) {
         this.tcNo = tcNo;
     }
     public void setHesapNo(int hesapNo) {
         this.hesapNo = hesapNo;
     }
 }


