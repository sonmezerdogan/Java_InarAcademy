package chapters.chapter_04;

import java.util.Scanner;

public class AngelsOfTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points with coordinate: eg.(-7 1 -1 5 -4 10) ");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double a = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
		double b = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y3-y1, 2));
		double c = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y2-y1, 2));
		
		double A= Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
		double B= Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
		double C= Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*a*b)));
		
		System.out.println("The thre angels of the triangles are :" + 
				Math.round(A) + " " + 
				Math.round(B) + " " + 
				Math.round(C));
		
		
		
	}

}
