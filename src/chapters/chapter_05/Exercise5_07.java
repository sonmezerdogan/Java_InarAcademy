package chapters.chapter_05;

public class Exercise5_07 {

	public static void main(String[] args) {

		int t= 10_000;
		int tFourYears=0;
		int tTenYears = 10_000;
		
		for(int y=1; y<=14; y++) {
			t+= t*0.05;
			if(y>10) {
				tFourYears+= t;
			}
			if(y<=10) {
				tTenYears+= t;
			}
		}	
			System.out.println("The tuition for ten years is: " +"$"+ tTenYears);
			System.out.println("The tuition for four years after ten years is: "+"$"+ tFourYears);
			
		
	}

}
