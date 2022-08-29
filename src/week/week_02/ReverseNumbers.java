package week.week_02;

import java.util.Scanner;

public class ReverseNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        System.out.print("Enter for digits number: ");
        int number = input.nextInt();
        
        System.out.print("The reverse of number you entered: ");
        while(number > 0) {
            
            System.out.print(number % 10);
            number /= 10;
		
		
        }
	}
}
