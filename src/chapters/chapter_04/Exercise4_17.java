package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_17 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		System.out.println("Enter a year such as: 2018");
		int year = input.nextInt();
		System.out.println("Enter a mounth such as: Jan, Apr, Oct, etc.");
		String month = input.next();
		
		boolean leapYear =
				((year % 4 ==0)&&(year % 100 !=0)) || (year %400==0);
		System.out.println(month + " " + year + " has");
		
		if ( month.equals("Jan") || month.equals("Mar") || 
				  month.equals("May") || month.equals("Jul") ||
				  month.equals("Aug") || month.equals("Oct") ||
				  month.equals("Dec"))
				System.out.println(31 + " days");
			else if (month.equals("Apr") || month.equals("Jun") || 
				month.equals("Sep") || month.equals("Nov"))
				System.out.println(30 + " days");
			else
				System.out.println(((leapYear) ? 29 : 28) + " days");
		
	}

}
