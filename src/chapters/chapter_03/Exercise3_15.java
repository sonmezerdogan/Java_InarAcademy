package chapters.chapter_03;

import java.util.Scanner;

public class Exercise3_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Generate a random three-digit number
				int lottery = (int)((Math.random() * 900)+100);
		// Prompt the user to enter a three-digit number
				System.out.print("Enter a three-digit number: ");
				int guess = input.nextInt();

				// Extract digits from lottery
				int lotteryDigit1 = lottery / 100;
				int remainingDigits = lottery % 100;
				int lotteryDigit2 = remainingDigits / 10;
				int lotteryDigit3 = remainingDigits % 10;

				// Extract digits from guess
				int guessDigit1 = guess / 100;
				int remainingDigits1 = guess % 100;
				int guessDigit2 = remainingDigits1 / 10;
				int guessDigit3 = remainingDigits1 % 10;

				 System.out.println("The lottery numbers are: " + lottery);

			        if (guess == lottery)
			            System.out.println("Exact Match!!! 10,000$ Prize!!!");
			        else if (guessDigit2 == lotteryDigit1 
			                && guessDigit1 == lotteryDigit2
			                && guessDigit3 == lotteryDigit3)
			            System.out.println("Matched all numbers!!! 3,000$ Prize!!!");
			        else if (guessDigit2 == lotteryDigit1 
			                && guessDigit3 == lotteryDigit2
			                && guessDigit1 == lotteryDigit3)
			            System.out.println("Matched all numbers!!! 3,000$ Prize!!!");
			        else if (guessDigit1 == lotteryDigit2 
			                && guessDigit3 == lotteryDigit1
			                && guessDigit2 == lotteryDigit3)
			            System.out.println("Matched all numbers!!! 3,000$ Prize!!!");
			        else if (guessDigit1 == lotteryDigit1 
			                && guessDigit3 == lotteryDigit2
			                && guessDigit2 == lotteryDigit3)
			            System.out.println("Matched all numbers!!! 3,000$ Prize!!!");
			        else if (guessDigit2 == lotteryDigit2 
			                && guessDigit3 == lotteryDigit1
			                && guessDigit1 == lotteryDigit3)
			            System.out.println("Matched all numbers!!! 3,000$ Prize!!!");
			        //Rule 3
			        else if (guessDigit1 == lotteryDigit1
			            || guessDigit1 == lotteryDigit2
			            || guessDigit1 == lotteryDigit3
			            || guessDigit2 == lotteryDigit1
			            || guessDigit2 == lotteryDigit2
			            || guessDigit2 == lotteryDigit3
			            || guessDigit3 == lotteryDigit1
			            || guessDigit3 == lotteryDigit2
			            || guessDigit3 == lotteryDigit3)  
			            System.out.println("Mathed one number!!! 1,000$ Prize!!!");
			        else 
			            System.out.println("No Match, Better Luck Next Time!");
		
	}

}
