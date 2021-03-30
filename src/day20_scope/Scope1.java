package day20_scope;

import java.util.Scanner;

import com.sun.source.tree.Scope;

public class Scope1 {
	
      public int sayi;// class'in icinde  fakat main metodun disinda olusturulan
               //ve static olmayan variable'lara INSTANCE(object) variable denir
               //class level'da olusturuldugu icin class'in her yerinden
              //belli sartlarla kullanilabilir
      
	public static void main(String[] args) {
		
	//	System.out.println(sayi); //static olmayan bir variable'astatic method icinden ulasamayiz
		 //main methodumuz static oldugu icin main method icerisinden
		//method();            //static olmayan variable veya methodlara direk ulasamayiz

		//instance bir variable' a main method icerisinden ulasmak istedigimizde
		//OBJECT olusturmaliyiz
		
		Scanner      scan=            new                   Scanner(System.in);//bu javadaki standart obje olusturma formudur
	 //class ismi   obje ismi   obje olusturmada keyword    clas ismi()
		
		Scope1 obj1 = new Scope1();
		System.out.println(obj1.sayi);
		System.out.println(obj1.sayi);
	}

	 public static void staticMethod() {
	
	}

	 public void method() {
		 
	 }
	 
} 
	 
	 
	 