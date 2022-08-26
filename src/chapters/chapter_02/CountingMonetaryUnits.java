package chapters.chapter_02;

import java.util.Scanner;

public class CountingMonetaryUnits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of money as decimal, such as 11.56: ");
		
		double amountMoney = input.nextDouble();
		
		double totalCents = amountMoney * 100;
		
		int dollars = (int) (totalCents / 100);
		
		double remainingCents = totalCents % 100;
		
		int quarters = (int) (remainingCents / 25);
		
		double remainingCents_1 = remainingCents % 25;
		
		int dimes = (int) (remainingCents_1 / 10);
		
		double remainingCents_2 = remainingCents_1 % 10;
		
		int nickels = (int) (remainingCents_2 / 5);
		
		double pennies = remainingCents_2 % 5;
		
		System.out.println("11.56 dollars consist of " + dollars + " dollars " + quarters + " quarters " +
		 dimes + " dimes " + nickels + " nickels " + pennies + " pennies");
		
		
		
		
	}

}
