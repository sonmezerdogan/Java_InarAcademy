package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_01 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		int sum=0;
		System.out.println("Enter a number :");
		int i=input.nextInt();
		int neg, pos, avverage;
		neg=0;
		pos=0;
		while(i!=0) {
			sum+=i;
			if(i<0)
				neg++;
			if(i>0)
				pos++;
			System.out.println("The sum is: "+ sum);
			System.out.println("Enter a number :");
			i=input.nextInt();
		}
		System.out.println("The sum is: "+ sum);
		System.out.println("The positive numbers: "+ pos);
		System.out.println("The negative numbers: "+ neg);
		System.out.println("The average: "+ sum/(pos+neg));


	}

}
