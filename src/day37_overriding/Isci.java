package day37_overriding;

public class Isci extends Personel {
	
	
	
	public String bolum="Kaynak Atolyesi";
	public int maas=5000;
	public String isim="Mesut";
	

    
    public int maasHesapla(String str) {
        return 30*8*15; // 30 gun sayisi, 8 gunluk mesai,15 saat ucreti
    }
    
    public void mesai(String str) {
        System.out.println("isciler gunluk 8 saat calisir");
    }
    
    //overloding:ayni isimde ama farkli method signature'larina sahip methodlar
    public int maasHesapla( int gunSayisi) {
    	
    return gunSayisi*8*15;
    
    }
    public int maasHesapla(int gunlukCalismaSaati,int gunSayisi) {
	
    	return int gunSayisi*gunlukCalismaSaati*15;
}
public int maasHesapla(int gunlukCalismaSaati,int gunSayisi,int saatUcreti) {
	return gunSayisi*gunlukCalismaSaati*saatUcreti;
}



	
	
	

}
