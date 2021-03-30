package day27_arraylist;

import java.util.Arrays;

import java.util.List;


public class ArrayList05 {

	public static void main(String[] args) {
		// verilen bir array'i liste nasil cevirebiliriz ?
		
		String arr[]= {"Ali","Veli"};
		
		List<String>listArr =Arrays.asList(arr);
		
       System.out.println(listArr);
       
      Integer arr1[]= {1,2,3};
      
       List<Integer>list2=Arrays.asList(arr1);
       System.out.println(list2);//[1,2,3]
       
    	//bazen cok fazla elemani lan bir liste olusturmamiz gerekir.
       //bu durumda liste elemanlarini tek tek eklemek yerine 
       //elemanlari bir array'e ekler,sonrada array' list'e cevirebiliriz
       //ornek bir web sitesindeki tum urunleri bir listeye eklemek istedigimizde
       
       //Ancak bu methodla arrayden cevirdigimiz list esnek olmaz
       // (array'in ozelliklerini tasir) add(), remove(),clear() gibi uzunlugu etkileyen methodlar kullanilamaz
       // Java bu degisimdeki Array ve List'i senkronize eder, birinde yaptigimiz degisiklik
       // otomatik olarak digerini de update eder

       // arr1 array ve list2 listesi senkron calisir, birinde yaptigimiz degisiklik digerine de islenir
       arr1[1]=5; 
       
       System.out.println(Arrays.toString(arr1));
       System.out.println("list2 : " + list2); 
       
       
       list2.set(2, 13);
       System.out.println("list2 : " + list2); 
       System.out.println("array : " + Arrays.toString(arr1));

       
       
       
	}

}
