package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.14159;
		
		System.out.println("Enter a radius to caunt the volume of cylinder: ");
		double radius = input.nextDouble();
		
		double area = radius * radius * PI;
		
		System.out.println("Enter a length to caunt the volume of cylinder: ");
		
		double length = input.nextDouble();
		
		System.out.println("The volume of cylinder: " + " is " + (area * length));
		
	}

}
