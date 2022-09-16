package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		int divider = 2;
		while (num / divider != 1) {
			if (num % divider == 0) {
				System.out.print(divider + ",");
				num /= divider;
			}
			
			else
					divider++;
			
			

		}
		System.out.println(num);
	}

}
