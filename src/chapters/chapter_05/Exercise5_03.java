package chapters.chapter_05;

public class Exercise5_03 {

	public static void main(String[] args) {
			System.out.printf("%-15s%-15s\n", "Kilograms", "Pounds"	);	
			for(int i=1; i<200; i++) {
			
			double pounds=i*2.2;
			System.out.printf("%-10d% 11.1f\n", i, pounds);
		}
	}

}
