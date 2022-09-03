package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Social Security Number eg:(DDD-DD-DDDD) :");
		String ssn= input.next();
		
		boolean isValid =
				(ssn.length()== 11) &&
				(Character.isDigit(ssn.charAt(0))) &&
				(Character.isDigit(ssn.charAt(1))) &&
				(Character.isDigit(ssn.charAt(2))) &&
				(ssn.charAt(3)=='-') &&
				(Character.isDigit(ssn.charAt(4))) &&
				(Character.isDigit(ssn.charAt(5))) &&
				(ssn.charAt(6)=='-') &&
				(Character.isDigit(ssn.charAt(7))) &&
				(Character.isDigit(ssn.charAt(8))) &&
				(Character.isDigit(ssn.charAt(9))) &&
				(Character.isDigit(ssn.charAt(10)));
								
		System.out.println(ssn + ((isValid)? " a VALID " : " an INVALID ")
						+ "social security number");
				

			
			
	}

}
