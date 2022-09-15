package chapters.chapter_05;

public class Exercise5_18 {

	public static void main(String[] args) {

		System.out.println("Pattern A" + "        " + "Pattern B" + "        " + "Pattern C" + "        " + "pattern D");
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(j+ " ");
			}
			for (int j = 1; j <= 7 - i; j++) {
	            System.out.print(j+ " ");
			}
			for (int k = 1; k <= 6 - i; k++) {
	            System.out.print("  ");
	        }
			
	        for (int j = 1; j <= i; j++) {
	            System.out.print(j + " ");
	        }
	        for (int k = i; k > 1; k--) {
	            System.out.print("  ");
	        }
	        for (int j = 1; j <= 7 - i; j++) {
	            System.out.print(j + " ");
	        }
			System.out.println();
		}
	}
}
