package day41_errors_garbagecollector;

public class Errors {

	public static void main(String[] args) {
		
		//System.out.println(20/0);//RTEdegil RunTimeException

		//String str="asd; //CTE dur...cunku cift tirnagi tamamlamadikca 
		//kod calismaz
		//bu tur yazimdan kaynaklanan hatalar kolayca duzeltilebilir
		
	    //Javada error  dendiginde onune gecilemeyen,kod ile cozulemeyen
		//sistemden kaynakli buyuk hatalar kastedilir
		
		//Errorlar unchecked dir ve java bunlari 
		//ancak gerceklestiginde kodun calismasi durdurulur
		
		String str="";
		 for (int i = 0; i <1000000; i++) {
			str+=i;
			
		}
	}

}
