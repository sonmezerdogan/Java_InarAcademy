package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int score;
		int highestScore=0;
		int secondHighestScore=0;
		String name=" ";
		String student1=" ";
		String student2=" ";
		
		
		System.out.println("Enter the number of students:");
		int numberOfStudents = input.nextInt();

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter student " + (i + 1) + " " + "name");
			name = input.next();
			System.out.println("Enter student "+ (i + 1) + " " + "score"   );
			score = input.nextInt();
			
			if(i==0) {
				highestScore=score;
				student1=name;
			}
			else if(i==1 && score>highestScore ) {
				secondHighestScore=highestScore;
				highestScore=score;
				student2=student1;
				student1=name;
			}
			else if(i==1) {
				secondHighestScore=score;
				student2=name;
			}
			else if(i>1 && score>highestScore && score>secondHighestScore) {
				highestScore=score;
				secondHighestScore=highestScore;
				student2=student1;
				student1=name;
			}
			else if(i>1 && score>secondHighestScore) {
				student2=name;
				secondHighestScore=score;
			}
		}
		System.out.println(student1 +" has the highest score with " + highestScore);
		System.out.println(student2 +" has the second highest score with " + secondHighestScore);
	}

}
