package chapters.chapter_03;

import java.util.Scanner;

public class Exercise3_29 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter x1 y1 coordinate and a radius for circle1: ");
		double x1= input.nextDouble();
		double y1= input.nextDouble();
		double r1= input.nextDouble();

		System.out.println("Enter x3 y3 coordinate and a radius for circle2: ");
		
		double x2= input.nextDouble();
		double y2= input.nextDouble();
		double r2= input.nextDouble();
		
		double d = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
		
		if (d <= (Math.abs(r1-r2))) 
			System.out.println("The circle2 is INSIDE the circle1.");
		else if (d <= Math.abs(r1+r2)) 
			System.out.println("The circle2 OVERLAPS circle1.");
		else 
			System.out.println("The circle2 is OUTSIDE the circle1");
	
			
		
	}

}
