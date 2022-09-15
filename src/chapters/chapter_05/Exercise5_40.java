package chapters.chapter_05;

public class Exercise5_40 {

	public static void main(String[] args) {
		int head = 0;
		int tail = 0;
		for (int i = 1; i <= 1_000_000; i++) {
			if ((int)(Math.random()*2) == 0) {
				head++;

			}

			else
				tail++;
		}
			System.out.println("The number of heads is: "+ head);

			System.out.println("The number of tails is: "+ tail);
		

	}

}
