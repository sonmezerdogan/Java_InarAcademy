package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_06 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000: ");
		
		int number = input.nextInt(); 
		
		int firstDigit = number % 10;
		
		int remainingNumber = number / 10;
		
		int secondDigit = remainingNumber % 10;
		
		remainingNumber = remainingNumber / 10;
		
		int thirdDigit = remainingNumber % 10;
		
		int sum = firstDigit + secondDigit + thirdDigit;
		
		System.out.println(" The sum of digits is " + sum);
		
	}

}
