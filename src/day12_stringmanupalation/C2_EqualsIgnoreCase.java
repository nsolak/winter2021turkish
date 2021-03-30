package day12_stringmanupalation;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
	// equalsIsIgnoreCase() method'u karsilastirdigi String'lere case sensitive
	//(buyuk kucuk harf duyarliligi) omaksizin bakar
	 //Stringler ayni ise true ayni degilse false doner
		
		
		String str1= "Ali Can";
		String str2= "ali CAN";
		String str3= "Ali can";
		
		
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		
		
		System.out.println(str1.equals(str3));// false
		System.out.println(str1.equalsIgnoreCase(str3));// true
		
		
		
		
		
		
		
		
		
		
	}

}
