package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_14 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a weight in pounds, and height in inches: " );
		
		double weight = scn.nextDouble();
		weight = weight * 0.45359237;
		
		double height = scn.nextDouble();
		height = height * 0.0254;
		
		double BMI = weight / (height * height);
		
		System.out.println("The BMI is " + (int)(BMI*100) / 100.0);
	}

}
