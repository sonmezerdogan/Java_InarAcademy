package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_07 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a radius to determine coordinates of five points for pentagon : ");
		
		double radius = input.nextDouble();
		
		
		
		double x1 = radius * Math.cos(72);
		double y1 = radius * Math.sin(72);
		double x2 = radius * Math.cos(144);
		double y2 = radius * Math.sin(144);
		double x3 = radius * Math.cos(216);
		double y3 = radius * Math.sin(216);
		double x4 = radius * Math.cos(288);
		double y4 = radius * Math.sin(288);
		double x5 = radius * Math.cos(360);
		double y5 = radius * Math.sin(360);
		
		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3 + " " + 
				x4 + " " + y4 + " " + x5 + " " + y5);
		
		
	}

}
