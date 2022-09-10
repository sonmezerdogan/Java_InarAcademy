package chapters.chapter_05;

import java.util.Scanner;

public class PlayGuessNumber2 {

	public static void main(String[] args) {

		int number=(int)(Math.random()*101);
		Scanner input=new Scanner(System.in);
		
		while (true) {
			System.out.println("Guess a number between 0 and 100 :");
			int guess = input.nextInt();
			if (guess==number) {
				System.out.println("Right!!!");
				System.exit(0);
			}
			else if (guess<number) {
				System.out.println("Enter higher!");
			}
			else {
				System.out.println("Enter lower!");
			}
				
			}
				
			
		
	}

}
