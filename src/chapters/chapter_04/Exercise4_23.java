package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter payroll inforation
		System.out.print("Enter employee’s name: ");
		String name = input.next();	
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();

		// Display payroll statement
		double grossPay, federal, state, totalDeduction;
		System.out.printf(
			"Employee Name: " + name + 
			"\nHours Worked: " + hoursWorked +
			"\nPay Rate: $" + hourlyPayRate +
			"\nGross Pay: $" + (grossPay = hoursWorked * hourlyPayRate) +
			"\nDeductions:\n   Federal Witholding (20.0%): $" +
			(federal = grossPay * federalTaxRate) +
			"\n   State Witholding (9.0%): $" + (state = grossPay * stateTaxRate) +
			"\n   Total Deduction: $" + (totalDeduction = federal + state) +
			"\nNet Pay: $" + (grossPay - totalDeduction)
			);
	}

}
