package day13_stringmanipulation;

public class C5_ReplaceAllTekrar {

	public static void main(String[] args) {
		String str="Java ogren,mutlu ol,Java candir";
		System.out.println(str.replace("Java", "hava"));
       
		// replaceAll() methodu replace() methoduna benze ama 2 farki vardir
		//1-replace()methodu char kaul eder ama replaceAll() kabuletmez
		//2-replaceAll() methodu regexp kullanimine izin verir
		
		System.out.println(str.replaceAll(str, str));
		System.out.println(str.replaceAll("\\w", "*")); // tum harf ve rakamlar yerine * yazacak
        System.out.println(str.replaceAll("\\W", "*")); // w'nun tersi
        System.out.println(str.replaceAll("\\d", ".")); // sayilari . yapar
        System.out.println(str.replaceAll("\\D", ".")); // sayi olmayanlari . yapar
        System.out.println(str.replaceAll("\\s", "&")); // bosluklari & yapar
        System.out.println(str.replaceAll("\\S", "&")); // bosluk olmayan herseyi & yapar
        System.out.println(str.replaceAll("\\d" , "")); // sayilari siler
    }


		
		
	}


