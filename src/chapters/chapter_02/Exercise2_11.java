package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of years : ");
		
		int years = input.nextInt();
		
		int population = (((years*365*24*60*60)/7)+((years*365*24*60*60)/45)-((years*365*24*60*60)/13)+312032486);
		
		System.out.println("The population of The USA after " + years + " years " + " will be " + population);
		
	
	}

}
