package day35_inheritance;

public class Personel {
	
     public String isim;
public int sayi;

     public Personel() {// parametresiz bir cons.olusturdum
	super();
	//super();
			/*javadan yardim alarak bir constructor olusturdufgumuzda
			 * java constructor'in satirina (); keyword'unu ekler
			 * eger icinde oldugumuz class bir cild class degilse super();keywordu kullanmadik
			 *   Bugune kadar biz olusturdugumuz constructorlarda hic super(); keyword'u kullanmadik
            ancak bizim classlarimiz child class olmadigindan sorun olmadi

			 * 
			 */
	System.out.println("Personel parametresiz constructor calisti");
}

	public Personel(String isim, int sayi) {// parametreli bir cons.olusturdum
		
		System.out.println("Personel parametreli constructor calisti");
		
	}

	
    
     /*eski derslerden hatirlatma
     her class default constructur' a sahiptir.
     default contructor'in parametresi yoktur
     biz parametreli veya parametresiz contrutor olusturdugumuzda default cons. silinir.
     eger biz sadece bir tane parametreli cons. olusturursak ,java default olani sildigi icin 
     parametresiz cons. kalmaz.
     dolayisiyla parametreli bir cons. olusturdugumuzda mutlaka  default cons.yerinede 
     parametresiz bir cons. olusturmamiz lazim.
     
     */
     
	}


