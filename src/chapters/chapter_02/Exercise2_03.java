package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter a number of feet for meter: ");
		
		double feet = input.nextDouble();
		
		double meter = feet * 0.305;
		
		System.out.println(" The " + feet + " feet is " + meter + " meter ");
	}

}
