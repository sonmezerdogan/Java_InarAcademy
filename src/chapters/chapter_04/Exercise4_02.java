package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_02 {

	public static void main(String[] args) {
		// d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter 2 points(latitude and longitude) in degrees" +
				"x1 y1 x2 y2 : 39.55 -116.25  41.5, 87.37");
				
		double radius= 6371.01;
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		
		double distance = radius * Math.acos((
				Math.sin(Math.toRadians(x1))*
				Math.sin(Math.toRadians(x2)) + 
				Math.cos(Math.toRadians(x1))*
				Math.cos(Math.toRadians(x2))*
				Math.cos(Math.toRadians(y1)- Math.toRadians(y2))));
		
		System.out.println("The distance is  " + distance +"km");

	}

}
