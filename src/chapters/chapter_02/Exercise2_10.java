package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter M, C1, C2 : ");
		
		
		
		double M = input.nextDouble();
		double C1 = input.nextDouble();
		double C2 = input.nextDouble();
		
		double Q = M * (C2 - C1) * 4184;
		
		System.out.println("The energy needed is " + Q + " joules");
		
		
	}

}
