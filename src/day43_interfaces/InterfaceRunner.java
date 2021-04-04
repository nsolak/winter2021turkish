package day43_interfaces;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
		//static olaraak tanimlanmis bir variable veya method
		//baska classdan  classIsmi.methodIsmiseklinde cagrilabilir
		
		Interface02.deneme2();

		
		//default keyword'u ile olusturdugumuz method ise  
		//obje uzerinden cagrilabilir
		
		InterfaceRunner obj1=new InterfaceRunner();
		obj1.deneme();
	}

}
