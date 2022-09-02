package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the score with A, B, C, D or F : ");
		String letterGrate= input.next();
		
		char score=letterGrate.charAt(0);
		if (score !='A' && score !='B' && score !='C' && score !='D' && score !='F') {
			System.out.println("Invalid score! Please enter the score with A, B, C, D or F ");
		}else
		
		switch(score) {
		case 'A': System.out.println(4);break;
		case 'B': System.out.println(3);break;
		case 'C': System.out.println(2);break;
		case 'D': System.out.println(1);break;
		case 'F': System.out.println(0);break;
		}
		
	}

}
