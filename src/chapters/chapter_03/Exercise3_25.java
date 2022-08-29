package chapters.chapter_03;

import java.util.Scanner;

public class Exercise3_25 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	

		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		//if md1 equals to md2; d1 and d2 are parallel
		
		double md1 = (y2-y1)/(x2-x1);
		double md2 = (y4-y3)/(x4-x3);
		
		if (md1 == md2) {
			System.out.println("Two lines are parallel.");
		}
		else {
			double intersectionX= ((md1 * x1) - (md2 * x3) +y3 -y1) / (md1 - md2);
			double intersectionY= (md1 * (intersectionX - x1) + y1 + md2 *(intersectionX -x3)+y3)/2;
			
			System.out.println("The intersection point is: " + intersectionX + " " + intersectionY) ;
		}

		
		}
		

}
