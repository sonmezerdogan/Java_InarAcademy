package chapters.chapter_02;

import java.util.Scanner;

public class Exercise2_13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the monthly saving amount: ");
		
		double m = input.nextDouble(); 
		
		double m1 = m * 1.00417;
		double m2 = m1 * 1.00417;
		double m3 = m2 * 1.00417;
		double m4 = m3 * 1.00417;
		double m5 = m4 * 1.00417;
		double m6 = m5 * 1.00417;
		double accountValue = m1 + m2 + m3 + m4 + m5 + m6;
		
		System.out.println("After six months The AccountValue is " + accountValue);
		
		
		
		
		
	}

}
