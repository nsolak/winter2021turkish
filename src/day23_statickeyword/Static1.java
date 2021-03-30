package day23_statickeyword;

public class Static1 {
     static String isim="Mehmet";
     int yas =49;
     
	public static void main(String[] args) {
	// static variable'lar oludturulan tum objeler icin gecerlidir(okuladi gibi)
	//mesela bir class'da 1 instance, 1 de static variable olsun	
		
		Static1 str1=new Static1();
		Static1 str2=new Static1();
		Static1 str3=new Static1();
		
		str1.isim="Hasan";
		str1.yas=25;
		System.out.println(str1.isim+" " +str1);
		
	}
	
	

}
