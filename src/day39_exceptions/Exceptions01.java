package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
	//javaya bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde
	//java "Ya dosyayi bulamazsam" der.ve bizden cozum uretmemizi bekler.
	//dosya bulma  ile ilgili exception turu:FileNotFoundException	
	//java koduyazar yazmaz buradaki olasi problemi  gorur ve CTE verir
	//Kodumuzu yazdigimiz anda ortaya cikanbu tur exception'lara Checked Exceptions diyoruz
		
		
  try {
	FileInputStream fis=new FileInputStream("C:\\Users\\PC\\eclipse-workspace2\\winter2021turkish\\src1\\day39_exceptions\\File");
} catch (FileNotFoundException e) {
	
	//e.printStackTrace();//tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
	System.out.println(e.getMessage()); //daha az hata aciklamasi yazdirir
}
  System.out.println("Kod bloke olmamisss");
	}

}
