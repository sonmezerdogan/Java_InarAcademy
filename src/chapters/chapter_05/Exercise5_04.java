package chapters.chapter_05;

public class Exercise5_04 {

	public static void main(String[] args) {

		System.out.printf("%-11s%-11s\n", "miles", "kilometers"	);
		for(int i=1; i<11; i++) {
			double km= i*1.609;
			System.out.printf("%-10d% -15.3f\n", i, km);
		}
	}

}
