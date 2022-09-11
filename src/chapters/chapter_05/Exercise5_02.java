package chapters.chapter_05;

import java.util.Scanner;

public class Exercise5_02 {

	public static void main(String[] args) {

		final int QUESTION_NUMBER= 15;
		int correctAnswer=0;
		int count=0;
		long startTime=System.currentTimeMillis();
		String output=" ";
		Scanner input=new Scanner(System.in); 
		
		while(count<15) {
			int n1=(int)(Math.random()*10);
			int n2=(int)(Math.random()*10);
			if(n1<n2) {
				int temp=n1;
				n1=n2;
				n2=temp;
			}
			System.out.println("what is "+ n1+ "-"+ n2 +"?" );
			int answer=input.nextInt();
			if((n1-n2)==answer) {
				System.out.println("You are correct");
				correctAnswer++;
			}
			else 
				System.out.println("Your answer should be "+ (n1-n2));
			
			count++;
			output+="\n" +n1 + "-" + n2 + "=" + answer +
					((n1-n2==answer)? " correct":" wrong");
				
				
			}
		
			long endTime=System.currentTimeMillis();
			long testTime=endTime-startTime;
			System.out.println("Number of correct answers:"+ correctAnswer +
					" Test time is: "+ testTime/1000 +" seconds\n"+output);
	}

}
