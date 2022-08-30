package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_05 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of sides and the length of a side .");
		
		int n= input.nextInt();
		double s= input.nextDouble();
		double area= (n * Math.pow(s, 2))/(4 * Math.tan(Math.PI/n));
		
		System.out.println("The area of a regular polygon is: " + area);
	}

}
