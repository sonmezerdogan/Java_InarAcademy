package chapters.chapter_03;

import java.util.Scanner;

public class Exercise3_08 {

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter three digits such as: 5 9 3 ");
		
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int number3 = in.nextInt();
		
		int temp;
		
		if (number2 < number1 || number3 < number1);
		{
			if (number2 < number1);
			{
			temp = number1;
			number1 = number2;
			number2 = temp;
			}
			if (number3 < number1);
			{
			temp = number1;
			number1 = number3;
			number3 = temp;
			}
		}
		if (number3 < number2);
		{
			temp = number2;
			number2 = number3;
			number3 = temp;
		}
		
		System.out.println(number1 + " " + number2 + " " + number3);
		}
		}
	


