package day34_Inheritance;

public class Encapsulation {

	
		private String okulIsmi="Yildiz Koleji";
		private int okulHesapNo=12345;
		private boolean okulAcikMi=true;
		
		public String getOkulIsmi() {
			return okulIsmi;
			
		}
  
		public int getOkulHesapNo(){
		return okulHesapNo;
		}
		public boolean getOkulAcikMi() {
			return okulAcikMi;
			
		}
		public void setOkulIsmi(String okulIsmi) {
			this.okulIsmi=okulIsmi;
		}
		public void setOkulHesapNo(int okulhesapNo){
			this. okulHesapNo=okulHesapNo;
			
		}
		 public void setOkulAcikMi(boolean okulAcikMi) {
		        this.okulAcikMi=okulAcikMi;
		    }

	}

