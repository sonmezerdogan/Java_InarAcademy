package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_04 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a side of hexagon:");
		
		double s = input.nextDouble();
		//double area = (3 * Math.pow(s, 2) *Math.sqrt(3))/2;
		double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI/6));
		
		System.out.println("The area of hexagon is: " + area);
	}

}
