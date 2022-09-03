package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string :");
		String str = input.next();
		int len = str.length();
		char ch1 =str.charAt(0);
		System.out.println("The length and the first letter of string is :" +  len + ch1);
		
		
	}

}
