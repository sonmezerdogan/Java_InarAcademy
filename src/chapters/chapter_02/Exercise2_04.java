package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number of pound for kilogram: ");
		
		double pound = input.nextDouble();
		
		double kilogram = pound * 0.454;
		
		System.out.println(" The " + pound + " pound " + " is " + kilogram);
		
		
	}

}
