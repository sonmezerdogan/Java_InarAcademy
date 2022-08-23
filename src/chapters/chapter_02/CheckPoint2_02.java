package chapters.chapter_02;

import java.util.Scanner;

public class CheckPoint2_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number for the circle of radius: ");
		
		double radius = input.nextDouble();
		double area = radius * radius * 3.14159;
		
		System.out.println("The area for the circle of radius " +
					       radius + " is " + area);
	}

}
