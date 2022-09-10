package chapters.chapter_05;

public class MultiplicationTable {

	public static void main(String[] args) {

		System.out.println("                 Multiplication Table            ");
		for (int i=1; i<10; i++) {
			System.out.printf("  %3d", i);
		}
		System.out.println("\n   ---------------------------------------------------");
		
		for (int j=1; j<10; j++) {
			System.out.print( j + "|");
			for (int i=1; i<10; i++)
				
				System.out.printf("%3d  ",i*j);
			
					
		System.out.println();
		}
		
	}

}
