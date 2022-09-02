package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two characters :");
		String status=input.next();
		char lesson= Character.toUpperCase(status.charAt(0));
		char year= status.charAt(1);
		
		String lesName= "";
		String yearName= "";
		
		if (lesson == 'M' || lesson == 'C' || lesson == 'I')
		{
			switch(lesson)
			{
				case 'M':
					lesName = "Mathematics";
					break;
				case 'C':
					lesName = "Computer Science";
					break;
				case 'I':
					lesName = "Information Techonology";
					break;
			}
			switch (year)
			{
			case '1' :
				yearName = "Frehman";
				break;
			case '2' :
				yearName = "Sophomore";
				break;
			case '3' :
				yearName = "Junior";
				break;
			case '4' :
				yearName = "Senior";
				break;
				}
			System.out.printf("%s %s%n", lesName, yearName);
		}
		else {
			System.out.println("Invalid input.%");
		}
		
		
	}


}
