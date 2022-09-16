package chapters.chapter_05;

public class Exercise5_27 {

	public static void main(String[] args) {

		int year = 101;
		int count = 0;
		for (year = 101; year <= 2100; year++) {
			if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				count++;
			
				if (count % 10 == 0) {
					System.out.println(count + "-" + year);
				} else
					System.out.print(count + "-" + year+ " ");
			}
		}
	}

}
