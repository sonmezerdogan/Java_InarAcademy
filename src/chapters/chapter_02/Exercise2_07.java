package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_07 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number of minutes: ");
		
		int minute = input.nextInt();
		
		int minOfYear;
		
		minOfYear = 365 * 24 * 60;
		
		int year = minute / minOfYear;
		
		int minOfDay = minute - (year * minOfYear);
		
		int day = minOfDay / (60 * 24);
		
		System.out.println(" The " + minute + " minutes is " + year + " years " + day + " days "  );
		
		
		
		
		
		
		
	}

}
