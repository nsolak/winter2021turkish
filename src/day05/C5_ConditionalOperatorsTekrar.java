package day05;

public class C5_ConditionalOperatorsTekrar {

	public static void main(String[] args) {
	// AND && ,OR ||
	// AND operatoru mükemmelliyetcidir.Hepsi true olursa soucu true yapar,
	// bir tane bile false olsa soucu false yapar
    // matematikteki carpma islemi gibidir (true =1 false=0)
		boolean isTrue= 5>4 && 7-3>0 ; // True

		System.out.println(isTrue);
		
		int x=10;
		int y=5;
		System.out.println(x/y==2 && x*y>20 && x-y>0); //True
		
		System.out.println(x+y<0 && x-y>0); // False
		
		//OR operatoru ise optimisttir.
		// Verilen karsilastirmalardan 1 tanesi bile dogru ise sonuc true olur
		// true 1 false0 ise toplama islemi gibi dusunebiliriz
		System.out.println(x<y || x+y<0 || x*y>0); // True
		
		
		
		
				
		
	}

}
