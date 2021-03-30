package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
      int sayi=10;
      int sayi2=20;
      int sayi3=30;
      String isim="Ali";
      // java'da birden fazla elemani koyabilecegimiz(store) objeler vardir
      // bugun bunlardan ilkini ogrenecegiz

      int arr[]= {10,20,30};
      
	
      
      
      
      System.out.println(arr);
      
      
      System.out.println(Arrays.toString(arr)); // [10, 20, 30]
      
      String takim[]= new String[3];//[null,null,null]
    	System.out.println(Arrays.toString(takim));	  
      
    	takim[0]="Ali";
    	System.out.println(Arrays.toString(takim));//[Ali, null, null]
    	
    	takim[2]="Hasan";
    	takim[1]="Veli";
    	System.out.println(Arrays.toString(takim));//[Ali, veli, Hasan]
    	
    	//takim[3]="Mehmet";
    	
    	
    	takim[1]="Kemal";
    	System.out.println(Arrays.toString(takim));//[Ali, Kemal, Hasan]
    	
    	
    	System.out.println(takim.length);//3
    	                                 //Stringdeki lengt() vardi Array de ise parantez yoktur
    	//Array'deki son elemani Mehmet yapin
    	takim[takim.length-1]="Mehmet";
    	System.out.println(Arrays.toString(takim));
    	
    	//eger array'in eleman sayisi tek ise ordaki elemani Can yapalim
    	
    	if (takim.length %2 ==1) {
			int ortaIndex=(takim.length-1)/2;
			takim[ortaIndex]="Can";
			
			} 

    	System.out.println(Arrays.toString(takim));
    	
		}
	}

