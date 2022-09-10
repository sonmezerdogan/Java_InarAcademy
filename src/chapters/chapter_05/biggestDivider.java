package chapters.chapter_05;

import java.util.Scanner;

public class biggestDivider {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number1 =input.nextInt();
		System.out.println("Enter a number:");
		int number2 =input.nextInt();
		int biggestDivider=2;
		int divider=1;
		while (number1>divider && number2>divider) {
			if (number1%divider ==0 && number2%divider==0) {
				biggestDivider=divider;
			}divider ++;
		}
				System.out.println("The biggest divider of " + number1 +" and " + number2 + " is "+ divider);

			
		}

}
