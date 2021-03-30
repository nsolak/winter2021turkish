package day22_constructor;

public class Otomobil {
	
	public Otomobil(String renk){//istersek constructor'i prarametreli olarak olusturabiliriz
		
	}
	//
	//
	//
	
	public Otomobil() {// default constructor'in yerine bunu yazmaliyiz
		
	}
	
	
	String marka;
    String model;
    int yil;
    boolean kazasiVarMi;
	
    public void yakit(String yakit) { // method
        System.out.println("Araba yakit olarak " + yakit  + " kullanir");
    }
    
    public void vites(String vites) { // method
        System.out.println("Araba " + vites + " viteslidir");
    }

}
