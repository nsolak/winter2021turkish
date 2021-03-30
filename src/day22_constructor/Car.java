package day22_constructor;

public class Car {
     String marka;
     String model;
     int yil;
     boolean kazasiVarMi;
     
      
	public static void main(String[] args) {
		Car car1= new Car();
		
		System.out.println(car1.marka + " " +car1.model +" " +car1.yil +" " +car1.kazasiVarMi);
          //null null 0 false
		
		car1.marka="Toyota";
		car1.model="Corolla";
		car1.yil=2010;
		car1.kazasiVarMi=false;
		System.out.println(car1.marka + " " +car1.model +" " +car1.yil +" " +car1.kazasiVarMi);
		//Toyota Corolla 2010 false
		
		
		
	}

}
