package chapters.chapter_05;

public class Exercise5_35 {

	public static void main(String[] args) {
		double sum=0.0;
		for(double i=1; i<=624; i++) {
			sum+= 1/ Math.sqrt(i) + Math.sqrt(i+1);
		}
		System.out.println("Sum=" + sum);
	}

}
