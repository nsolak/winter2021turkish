package day28_foreachloop;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		// bir array'in tum elemanlarini for loop ile yazdiralim
		
		int arr[]= {2,4,6,8,10,12};
		
		for(int i= 0; i<arr.length; i++ ) {
			System.out.print(arr[i]+" "); 
			
		}
		
		//
		//
		
		
		//each==> her bir demek
		//for each loop istedigim bir topluluktaki tum elemanlari birer birer bana getirir
		//for each loop'da baslang�c degeri YOKTUR, bitis degeri YOKTUR,index YOKTUR
		System.out.println();// gorevi cursor'u alt satira indirmek
		
		for (int each :arr) {
			System.out.print(each +" ");
		}
	}

}
