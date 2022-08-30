package chapters.chapter_03;

import java.util.Scanner;

public class isPointOutsideTriangle {
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 

		System.out.print("Enter a point's x- and y-coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		// Think a new hypotenuse the point given is on it. 
		// Calculate the lenght of it.
		double x1 = 2 * y + x;
		double y1 = y + x / 2;
		double hypotenuse2 = Math.sqrt((x1) * (x1) + (y1) * (y1));
		double hypotenuse1 = Math.sqrt(200*200 + 100*100);
		
		if (hypotenuse2 > hypotenuse1) {
		System.out.println("The point is OUTSIDE the triangle.");
		}else {
			System.out.println("The point is INSIDE the triangle.");
		}
	
	}

}


