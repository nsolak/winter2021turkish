package day21_scope;

public class Scope6 {
	public int num1;//access modifier public yapilinca heryerden ulasilabilir
	String name = "Ali";// access modifier yazilmadigi icin default access modifier gecerlidir
	                   //sadece paket icinde kullanilabilir
	public static void main(String args){ 
	  add();
	//product (5); static olmayan bir method static olan main methot icerisinden cagrilamaz
	  
	}
	public static  void add(){
	//num1 ++;// static olmayan (instance) num1, static bir method icinde kullanýlamaz
	
	int num2 = 6;
	char letter;
	System.out.println("Do addition ");
	}
	public void product(int num3){
	name = "Veli";
	//num2++;// num2 ustteki method da olusturulmus Localbir variabledir.
	System.out.println(num3 * num3);
	} }


