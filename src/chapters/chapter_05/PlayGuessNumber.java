package chapters.chapter_05;

import java.util.Scanner;

public class PlayGuessNumber {

	public static void main(String[] args) {

		int number = (int) (Math.random() * 101);
		Scanner myboard = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100  :");
		int guess = -1;
		while (guess != number) {
			System.out.println("\nGuess a number :");
			guess = myboard.nextInt();
		
		if (guess == number) 
			System.out.println("Right!");
		else 
		if (guess > number) 
			System.out.println("Your guess is bigger than number ");
		else 
			System.out.println("Your guess is smaller than number ");
		}

	}
}
