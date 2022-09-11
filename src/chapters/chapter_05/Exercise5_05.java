package chapters.chapter_05;

public class Exercise5_05 {

	public static void main(String[] args) {

		System.out.println( "Kilograms\t" + " Pounds\t" + "    |" + "       Pounds\t" +"  Kilogram"	);	
		for(int k=0, p=20; k<200 && p<516; k+=2, p+=5) {
			
			System.out.printf("%-10d%12.1f",(2*k+1),(2*k+1)*2.2);
			System.out.print("      |       ");
			System.out.printf("%-10d%12.2f\n", p, (p/2.2));
					
		
		}
		
		}
		

}
