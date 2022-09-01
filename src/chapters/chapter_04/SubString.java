package chapters.chapter_04;

public class SubString {

	public static void main(String[] args) {

		String str1= "Inar_Academy";
		
		String str2= str1.substring(5);
		System.out.println(str2);
		
		str2= str1.substring(5,9);
		System.out.println(str2);
		
		str2= str1.substring(1,4);
		System.out.println(str2);
		str2= str1.replaceAll("r_A", "rA");
		System.out.println(str2);
		
		String message= "Welcome to Java";
		message= message.substring(0,11) + "HTML";
		System.out.println(message);
		
		System.out.println(message.indexOf('e', 2));
		System.out.println("--------------------------------------------");

		System.out.println("Welcome to Java".indexOf('w'));
		System.out.println("Welcome to Java".indexOf('o'));
		System.out.println("Welcome to Java".indexOf('o', 5));
		System.out.println("Welcome to Java".indexOf("come"));
		System.out.println("Welcome to Java".indexOf("Java", 5));
		System.out.println("Welcome to Java".indexOf("java", 5));
		System.out.println("Welcome to Java".lastIndexOf('W'));
		System.out.println("Welcome to Java".lastIndexOf('o'));
		System.out.println("Welcome to Java".lastIndexOf('o', 5));
		System.out.println("Welcome to Java".lastIndexOf("come"));
		System.out.println("Welcome to Java".lastIndexOf("Java", 5));
		System.out.println("Welcome to Java".lastIndexOf("Java"));

		
	}

}
