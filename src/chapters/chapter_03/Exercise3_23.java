package chapters.chapter_03;

import java.util.Scanner;

public class Exercise3_23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a point with two coordiates e.g (3 4)");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean withInRectangle =
				(x <= 5 && x >= -5) && (y <= 5/2 && y>= -5/2);
		System.out.println("Point (" + x + ", "+ y + ") is " + 
				((withInRectangle) ? "in " : "not in ") + "the rectangle"); 
	}

}
