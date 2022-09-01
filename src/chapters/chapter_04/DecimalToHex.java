package chapters.chapter_04;

import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number between 0 and 15");
		int number = input.nextInt();
		int n = number;
		if (n<10 && n>=0) {
			System.out.println(n);
		}
		if (n>15) {
			System.out.println("Enter the number between 0 and 15 !!!");
		
		}
		if (n>9 && n % 10 == 0) {
			System.out.println("A");
		}
		if (n>9 && n % 10 == 1) {
			System.out.println("B");
		}
		if (n>9 && n % 10 == 2) {
			System.out.println("C");
		}
		if (n>9 && n % 10 == 3) {
			System.out.println("D");
		}
		if (n>9 && n % 10 == 4) {
			System.out.println("E");
		}
		if (n>9 && n % 10 == 5) {
			System.out.println("F");
		}
			
		
		
	}

}
