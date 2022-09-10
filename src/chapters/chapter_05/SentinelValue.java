package chapters.chapter_05;

import java.util.Scanner;

public class SentinelValue {

	public static void main(String[] args) {

		Scanner mykeyboard=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=mykeyboard.nextInt();
		int sum=0;
		while (number!=0) {
			sum += number;
			System.out.println("Enter a number:");
			number =mykeyboard.nextInt();
		}
		System.out.println("Sum = " + sum);
	}

}
