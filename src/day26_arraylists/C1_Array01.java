package day26_arraylists;

public class C1_Array01 {

	public static void main(String[] args) {
		/*
		Soru 6) Verilen bir Array’den istenen degere
         esit olan elamanlari kaldirip,
         kalanlari yeni bir  Array olarak yazdiran bir method yaziniz
         */
		
		
		int arr[]= {2,3,5,3,6,4,3,6,7};
		int sayi=3;
		//
		
		int count=0;
		for(int i= 0; i<arr.length; i++) {
			if(arr[i]==sayi) {
				count++;
			}
		}
		
		
	}
	
}