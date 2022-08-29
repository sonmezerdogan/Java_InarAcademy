package week.week_02;

import java.util.Scanner;

public class AgeOfPeople {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the ages of three people eg. 15 20 9");
		int age1 = input.nextInt();
		int age2 = input.nextInt();
		int age3 = input.nextInt();
		int temp;
		
		if (age2 < age1) {
			temp = age1;
			age1 = age2;
			age2 = temp;
		}
		if (age3 < age1) {
			temp = age1;
			age1 = age3;
			age3 = temp;
		}
		if (age3 < age2) {
			temp = age2;
			age2 = age3;
			age3 = temp;
		}
		System.out.println(age1 + " " + age2 + " " + age3 );
		}
	}


