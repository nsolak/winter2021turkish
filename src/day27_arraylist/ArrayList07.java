package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList07 {

	public static void main(String[] args) {
		//verilen bir arraydeki tekrarli elemalari silip 
		//tekrarsiz bir array olusturmak istiyoruz
		//array veya list kulanarak bunu yapiniz
		
		int arr[]= {1,2,3,5,1,2,4,3,5,1,6,7,1,2,6,4,2};
		
		List<Integer>list=new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(!list.contains(arr[i])) {
				
				list.add(arr[i]);
			}
		}
      System.out.println(list);
      Integer tekrarsizArray[]= list.toArray(new Integer[0]);
      
	}

}
