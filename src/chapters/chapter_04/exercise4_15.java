package chapters.chapter_04;

import java.util.Scanner;

public class exercise4_15 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a letter :");
		
		String s=input.next();
		String s1=s.toLowerCase();
		String str1 = "abc";
		String str2 = "def";
		String str3 = "ghi";
		String str4 = "jkl";
		String str5 = "mno";
		String str6 = "pqrs";
		String str7 = "tuv";
		String str8 = "wxyz";
						
		char ch = s1.charAt(0);
		
		if (str1.contains(s1)) {
			System.out.println(2);
		}
		else if (str2.contains(s1)) {
			System.out.println(3);
		}
		else if (str3.contains(s1)) {
			System.out.println(3);
		}
		else if (str4.contains(s1)) {
			System.out.println(4);
		}
		else if (str5.contains(s1)) {
			System.out.println(5);
		}
		else if (str6.contains(s1)) {
			System.out.println(6);
		}
		else if (str7.contains(s1)) {
			System.out.println(7);
		}
		else if (str8.contains(s1)) {
			System.out.println(8);
		}	
		else
			System.out.println(s1 + " is an invalid input");
			
		
		
	}

}
