package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int highestScore = 0;
		String highestScoreName = " ";

		System.out.println("Enter the number of students:");
		int numberOfStudents = input.nextInt();

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter student " + (i + 1) + " " + "name and score");
			String name = input.next();
			int score = input.nextInt();
			if (score > highestScore) {
				highestScore = score;
				highestScoreName = name;
			}

		}
		System.out.println(highestScoreName + " has the highest score with " + highestScore);
	}

}
