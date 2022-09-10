package chapters.chapter_04;

public class stringsStudy {

	public static void main(String[] args) {

		String s1 = "merhaba hababam";
		String s2 = "ha";
		
		System.out.println(s1.indexOf("h"));
		// "h harfi string'te kaçıncı harf?
		System.out.println(s1.indexOf("a",3));
		// String'te 3. indexten sonraki "a" kaçıncı sırada?
		System.out.println(s1.indexOf("ha"));
		// Stringte "ha" var ise ilk harfi kaçıncı sırada?
		System.out.println(s1.indexOf("ba",6));
		// string'te "ba" ifadesi 6. indexten sonra kaçıncı sırada başlıyor?
		System.out.println(s1.indexOf("er",2));
		// string'te 2.indexten sonra "er" ifadesi yoksa "-1" yazar.
		System.out.println(s1.lastIndexOf("h"));
		//string'te en son "h" harfi kaçıncı sırada?
		System.out.println(s1.lastIndexOf("a",3));
		//3.indexten önce a var mı? yoksa "-1" 
		System.out.println(s1.lastIndexOf("ba",9));
		//9.indexten önce "ba" ba nerde başlıyor?
		System.out.println(s1.lastIndexOf("ba"));
		//en son "ba" nerde başlıyor?
		//....................................................
		//isDigit, isLetter, isLetterOrDigit,
		//isLowerCase, isUpperCase
		char ch='A';
		System.out.println(ch + "abcdefgh\b");
		char ch1 = (char)65.25;
		System.out.println(ch1);
		int i=(int)'A';
		int i1=(int)'B';
		int i2=(int)'C';
		System.out.println(i+" "+i1+" "+i2);
		if (ch>='A'&&ch<='Z'){
			System.out.println(ch +" is a upperCase");
			System.out.println("isDigit('a') is " + Character.isDigit('a'));
			System.out.println("isLetter('a') is " + Character.isLetter('b'));
			System.out.println("isLowerCase('S') is "
			+ Character.isLowerCase('S'));
			System.out.println("isUpperCase('a') is "
			+ Character.isUpperCase('c'));
			System.out.println("toLowerCase('T') is "
			+ Character.toLowerCase('T'));
			System.out.println("toUpperCase('q') is "
			+ Character.toUpperCase('q'));
		
		}
		
		
		
	}

}
