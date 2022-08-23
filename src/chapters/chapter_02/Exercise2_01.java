package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a celsius degree: ");
		
		//Convert celsius to fahrenheit
		
		double celsius = input.nextDouble();
		double fahrenheit = (9.0/5) * celsius + 32;
		
		System.out.println("The " + celsius + " celsius is " + fahrenheit + " fahrenheit ");
		
		
		
		
	}

}
