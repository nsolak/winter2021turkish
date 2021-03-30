package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		
		
		LocalDateTime Idt = LocalDateTime.now();
       System.out.println(Idt);//2021-03-19T23:05:23.840903100
       
       System.out.println(Idt.toString());//2021-03-19T23:06:32.426679700
       
       String time= Idt.toString();
       
      
       System.out.println(time.startsWith("2021")); //true
       
	}

}
