package week;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		System.out.println("Enter the years that you served and salary: ");
		Scanner input = new Scanner(System.in);
		double years = input.nextDouble();
		double salary = input.nextDouble();
		double bonus = salary * 5 / 100;
		
		if (years > 5) {
		System.out.println("You have bonus " + bonus + "$");
		}else {
			System.out.println("No bonus yet");
		}
			
	}

}
