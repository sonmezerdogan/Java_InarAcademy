package chapters.chapter_04;

import java.util.Scanner;

public class compareStrings {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a letter :");
		String str="abc";
		System.out.println(str.startsWith("we"));
		System.out.println(str.endsWith("me"));
		System.out.println(str.contains("co"));
		System.out.println(str.contains("so"));
		

		/*String s1= "Welcome To Java";
		String s2= "Welcome to java";
		boolean b= s1.equalsIgnoreCase(s2);
		if (b) {
			System.out.println("String s1 equals to s2");
		}else {
			System.out.println("Strings are NOT egual");
		}
		String s3= "java";
		String s4= "jave";
		int compareStrings= compareTo(s3,s4);
		if (compareStrings==0) {
			System.out.println("equals");
		}else if (compareStrings>0) {
			System.out.println(s3 + " is bigger than " + s4);
		}else {
			System.out.println(s3 + " is smaller than " + s4);
		}
	}

	private static int compareTo(String s3, String s4) {
		if(s3.length() != s4.length()) {
			if(s3.length()>s4.length()) {
				return 1;
			}else {
				return -1;
			}
		for (int i=0; i<s3.length(); i++) {
			char ch1= s3.charAt(i);
			char ch2= s4.charAt(i);
			if(ch1 != ch2) {
				return ch1-ch2;
			}*/
		}
}
