package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
	   // AND && , OR ||
		// AND operatoru mukemmelliyetcidir.Hepsi true olursa sonucu true yapar,bir tane
		// bile false olsa sonuc false olur
		boolean isTrue= 5>4 && 7-3>0 ;
		
		System.out.println(isTrue);  // true
		
		int x=10;
		int y=5;
		
		
		System.out.println(x/y==2 && x*y>20 && x-y>0); // true  
		
		System.out.println(x+y<0 && x-y>0);  // false
		
		
		
		//OR operatoru ise optimistir.
		//Verilen karsilastirmalardan 1 tanesi bile dogru  ise sonuc true olur
		// (true 1 false0 ise toplama islemi gþbþ dusunebiliriz)
		System.out.println(x<y || x+y<0 || x*y>0); // true
		
		
	
		
		
		
		
		

	}

}
