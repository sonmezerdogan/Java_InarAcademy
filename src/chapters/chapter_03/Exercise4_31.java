package chapters.chapter_03;

import java.util.Scanner;

public class Exercise4_31 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB:");
		
		double rate = input.nextDouble();
		
		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
		
		int option= input.nextInt();
		
		System.out.println("Enter amount of money:");
		
		double amount= input.nextDouble();
		switch (option) {
			case 0: System.out.println("$"+ amount  + " is " + (rate * amount) + " yuan" );break;
				
			case 1: System.out.println(amount + " yuan is $" + ((int)(amount *100/ rate))/100 );
	}

}
}
