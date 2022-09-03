package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_22 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter two strings :");
		String s1 = input.next();
		String s2 = input.next();
		if(s1.indexOf(s2)!=-1) {
			System.out.println(s2 + " is substring");
		}else
			System.out.println(s2 + " is NOT substring");
		
			
		}
		
		
	

}
