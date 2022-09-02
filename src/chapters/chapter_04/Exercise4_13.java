package chapters.chapter_04;

import java.util.Scanner;

public class Exercise4_13 {


	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		System.out.println("Enter a letter :");
		
		String letter= input.nextLine();
		 char let =letter.charAt(0);
	       
	            switch(let)
	            {
	                case 'a': case 'e': case 'i': case 'o': case 'u':case 'ı': case 'ö': case 'ü':
	                	case 'A': case 'E':case 'I': case 'O': case 'Ü':case 'U': case 'Ö':case 'İ':
	                    System.out.println("letter" + " is a vowel");
	                    break;
	                default:
	                    System.out.println("letter" + " is not a vowel");
	            }    
	        }
		
		
	

}
