package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);

		System.out.println((int)ch);
	}

}
