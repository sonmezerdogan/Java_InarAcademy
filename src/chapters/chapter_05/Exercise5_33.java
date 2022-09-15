package chapters.chapter_05;

public class Exercise5_33 {

	public static void main(String[] args) {

		int sum;
		for (int i = 5; i <= 10000; i++) {
			sum = 0;
			for (int divisor = 1; divisor <= i / 2; divisor++) {
				if (i % divisor == 0) {
					sum += divisor;
				}
			}
			if (i == sum) {
				System.out.println(i);
			}
		}
	}

}
