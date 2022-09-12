package chapters.chapter_05;

public class Exercise5_06 {

	public static void main(String[] args) {

		final double MILES_TO_KM=1.609;
		System.out.println("Miles          Kilometers   |    Kilometers   Miles");
		for(int m=1, k=20; m<=10 && k<=65; m++, k+=5) {
		System.out.printf("%-10d%10.3f", m, (m*MILES_TO_KM));
		System.out.print("        |    ");
		System.out.printf("%-10d%9.3f\n", k, (k/MILES_TO_KM));
		}
	}

}
