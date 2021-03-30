package day37_overriding;

public class GeciciIsci extends Isci {

	public String calistigiBolum="Yemekhane";
	
	
	public static void main(String[] args) {
		
		// Overriding
		//bir child classdan miras alinan methodu 
		//degistirmeye overriding denir
		//public > protected > default > private--->not kendim yazdým
		GeciciIsci gi1=new GeciciIsci();
		System.out.println(gi1.maaasHesapla());
		gi1.mesai();
	}

	
	
	
	
	public int maaasHesapla() {
		
		return 30*8*10;
		
	}

 @Override  //anotation
public void mesai() {
	
	//super.mesai();
	
	System.out.println("Gecici isciler haftada 25 saat calisir");
 }
}

// mehmet hocanýn yorumu:

// annotation
//

// annotation olmasiile olmamasiarasindaki fark
//annotation sadece bir aciklama degildir
//override yaptigimiz methodu surekli kontrol eder ve parent classdaki
//overridden method

 //eger override edilen parent clasdaki method(overriden)un da
 //calismasini istiyorsak overrriding methoda  super.overridenMethodIsmi yazariz
 
//eger overriding method da  super. yazilmazsa 
//overridden method calismabz.

//access Modifier
//Child Paent'i sinirlandiramaz
//yani overriding 


//Return Type
//



//1.arkadasýn yorumu:
//farkli bir isim yapsam override yapmazsam parent sinifindan 
//metod vegecici siniftan
	//metod gozukur, birisi degistirebilir, yanlislikla isciye saat ucretini 15 ile carpabilir
	//boyle yaparak parent class daki metodu gecersiz kilarak onun kullanimini burada engelliyoruz
//&&&&&&&&&&-----&&&&&
//kazým beyýn yorumu
//Parent class'daki method'u child class'da kullanilmamasi icin 
//Parent class'la ayni isimli bir method olusturmaliyiz.
// Ayni isimli bir method olusturdugumuz zaman Parent Class'inda ki
//methodu ERISILEMEZ, KULLANILAMAZ yaptik yani overriding yaptik.


