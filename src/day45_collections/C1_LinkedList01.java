package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		// linked bagli demektir
		//linked list'te tum elemanlar tren gibi birbirine baglidir
		
		
		
		
		
		
		List<String>liste=new ArrayList<>();
		liste.add("X");
		liste.add("Y");//[X, Y]
		
		
		
		LinkedList<String>ll1=new LinkedList<>();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1);//[A, B]
		ll1.add(1, "C");
		System.out.println(ll1);//[A, C, B]
		ll1.addAll(liste);
		System.out.println(ll1);//[A, C, B, X,Y]
		
		ll1.addAll(2, liste);
		System.out.println(ll1);//[A, C, X, Y, B, X, Y]
		
		ll1.addLast("K");
		System.out.println(ll1);
		
	}

}
