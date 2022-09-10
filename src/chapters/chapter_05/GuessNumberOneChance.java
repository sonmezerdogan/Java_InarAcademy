package chapters.chapter_05;

import java.util.Scanner;

public class GuessNumberOneChance {

	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		int number= (int)(Math.random()*101);
		System.out.println("Guess a number between 0 and 100  :");
		int guess=myscan.nextInt();
		
		if (guess==number){
			System.out.println("Right!");
		}else if (guess>number) {
			System.out.println("Your guess is bigger than number ");
		}else if (guess<number) {
			System.out.println("Your guess is smaller than number ");
		}
	}

}
