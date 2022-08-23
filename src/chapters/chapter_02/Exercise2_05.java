package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the subtotal amount: ");
		
		double subtotal = input.nextDouble();
		
		double gratuity = subtotal * 15 / 100;
		
		double total = subtotal + gratuity;
		
		
		System.out.println("The  gratuity " + " is " + gratuity + " and the " +
				" total  is "  + total );
	}

}
